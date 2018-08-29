package com.example.new001.realmpraapp;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.new001.realmpraapp.Model.Photo;
import com.example.new001.realmpraapp.Model.PhotoDataModel;
import com.example.new001.realmpraapp.Model.User;
import com.example.new001.realmpraapp.Model.mUser;
import com.example.new001.realmpraapp.RealmDao.RealmManager;
import com.example.new001.realmpraapp.RealmDao.UserAdd;
import com.example.new001.realmpraapp.internet.dataAPI;
import com.google.gson.Gson;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.realm.Realm;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    private Realm realm;

    @SuppressLint("StaticFieldLeak")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        realm = RealmManager.getInstance();
        for (int i = 1; i < 10; i++) {
            mUser user = new mUser(i, "CBF" + i, 10 * i);
            UserAdd.addUserToRealm(user);
        }
        new MyAsynTask(){
            @Override
            protected Object doInBackground(Object[] objects) {
                try {
                    String photoInfo = getPhotoInfo();
                    Log.d("doInBackground", photoInfo);
                    Gson gson=new Gson();
                    final PhotoDataModel  data=gson.fromJson(photoInfo, PhotoDataModel.class);
                    Log.d("doInBackground",data.getInfo().getPhoto_num()+"");
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            realm = RealmManager.getInstance();
                            realm.beginTransaction();
                            for(PhotoDataModel.InfoBean.PhotoBean pb:data.getInfo().getPhoto()){
                            Photo object = realm.createObject(Photo.class);
                            object.setAlbum_id(pb.getAlbum_id());
                            object.setComment_num(pb.getComment_num());
                            object.setImage_url(pb.getImage_url());
                            object.setCopyright(pb.getCopyright());
                            object.setCopyright_commercial(pb.getCopyright_commercial());
                            object.setUrl(pb.getUrl());
                            object.setPhoto_title(pb.getPhoto_title());
                            object.setCopyright_modifications(pb.getCopyright_modifications());
                            object.setThumbnail_image_url(pb.getThumbnail_image_url());
                            object.setOriginal_width(pb.getOriginal_width());
                            object.setOriginal_height(pb.getOriginal_height());
                            object.setDate(pb.getDate());
                            object.setMedium_tag(pb.getMedium_tag());
                            object.setRegist_time(pb.getRegist_time());
                            object.setFavorite_num(pb.getFavorite_num());
                            object.setLarge_tag(pb.getLarge_tag());
                            object.setOriginal_image_url(pb.getOriginal_image_url());
                            object.setUser_id(pb.getUser_id());
                            object.setPhoto_id(pb.getPhoto_id());
                            }
                            realm.commitTransaction();
                        }
                    });


                } catch (IOException e) {
                    e.printStackTrace();
                }

                return super.doInBackground(objects);
            }
        }.execute();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        realm.close();
    }



    public String getPhotoInfo()  throws IOException {
        OkHttpClient client = new OkHttpClient.Builder()
                .connectTimeout(10, TimeUnit.SECONDS)   //连接超时
                .readTimeout(30, TimeUnit.SECONDS)      //读超时
                .writeTimeout(30, TimeUnit.SECONDS).build();//写超时

        Request request=new Request.Builder()
                .url(dataAPI.SAKURA_API)
                .build();
            Response response=client.newCall(request).execute();
            return response.body().string();
        }

    }

