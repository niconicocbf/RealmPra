package com.example.new001.realmpraapp.RealmDao;

import com.example.new001.realmpraapp.Model.User;
import com.example.new001.realmpraapp.Model.mUser;

import io.realm.Realm;

public class UserAdd {

    private static Realm realm;

    public static void addUserToRealm(mUser user){
        realm = RealmManager.getInstance();
        realm.beginTransaction();
        User object = realm.createObject(User.class);
        object.setAge(user.getAge());
        object.setName(user.getName());
        object.setId(user.getId());
        realm.commitTransaction();
    }
}
