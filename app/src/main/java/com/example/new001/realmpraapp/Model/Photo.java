package com.example.new001.realmpraapp.Model;

import java.util.List;

import io.realm.RealmModel;
import io.realm.annotations.RealmClass;

@RealmClass
public class Photo implements RealmModel{
            /**
             * photo_id : 249749162
             * user_id : 3107551
             * album_id : 8297701
             * photo_title : マンゴーラッシュ メチャ美味しかった～♪
             * favorite_num : 20
             * comment_num : 19
             * view_num : 95
             * copyright : creativecommons
             * original_height : 640
             * original_width : 427
             * copyright_commercial : no
             * copyright_modifications : no
             * date : 2017-08-01
             * regist_time : 2017-08-01T13:47:21+09:00
             * url : http://photozou.jp/photo/show/3107551/249749162
             * image_url : http://art13.photozou.jp/pub/551/3107551/photo/249749162.jpg
             * original_image_url : http://art13.photozou.jp/pub/551/3107551/photo/249749162_org.jpg
             * thumbnail_image_url : http://art13.photozou.jp/pub/551/3107551/photo/249749162_thumbnail.jpg
             * large_tag : <a href="http://photozou.jp/photo/show/3107551/249749162"><img src="http://art13.photozou.jp/pub/551/3107551/photo/249749162.v1504476090.jpg" alt="マンゴーラッシュ メチャ美味しかった～♪" width="300" height="450"></a><br><a href="http://photozou.jp/photo/show/3107551/249749162">マンゴーラッシュ メチャ美味しかった～♪</a> posted by <a href="http://photozou.jp/user/top/3107551">(C)さくら ふぶき</a>
             * medium_tag : <a href="http://photozou.jp/photo/show/3107551/249749162"><img src="http://art13.photozou.jp/pub/551/3107551/photo/249749162.v1504476090.jpg" alt="マンゴーラッシュ メチャ美味しかった～♪" width="160" height="240"></a><br><a href="http://photozou.jp/photo/show/3107551/249749162">マンゴーラッシュ メチャ美味しかった～♪</a> posted by <a href="http://photozou.jp/user/top/3107551">(C)さくら ふぶき</a>
             * geo : {"latitude":0,"longitude":0}
             */

            private int photo_id;
            private int user_id;
            private int album_id;
            private String photo_title;
            private int favorite_num;
            private int comment_num;
            private int view_num;
            private String copyright;
            private int original_height;
            private int original_width;
            private String copyright_commercial;
            private String copyright_modifications;
            private String date;
            private String regist_time;
            private String url;
            private String image_url;
            private String original_image_url;
            private String thumbnail_image_url;
            private String large_tag;
            private String medium_tag;

            public int getPhoto_id() {
                return photo_id;
            }

            public void setPhoto_id(int photo_id) {
                this.photo_id = photo_id;
            }

            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }

            public int getAlbum_id() {
                return album_id;
            }

            public void setAlbum_id(int album_id) {
                this.album_id = album_id;
            }

            public String getPhoto_title() {
                return photo_title;
            }

            public void setPhoto_title(String photo_title) {
                this.photo_title = photo_title;
            }

            public int getFavorite_num() {
                return favorite_num;
            }

            public void setFavorite_num(int favorite_num) {
                this.favorite_num = favorite_num;
            }

            public int getComment_num() {
                return comment_num;
            }

            public void setComment_num(int comment_num) {
                this.comment_num = comment_num;
            }

            public int getView_num() {
                return view_num;
            }

            public void setView_num(int view_num) {
                this.view_num = view_num;
            }

            public String getCopyright() {
                return copyright;
            }

            public void setCopyright(String copyright) {
                this.copyright = copyright;
            }

            public int getOriginal_height() {
                return original_height;
            }

            public void setOriginal_height(int original_height) {
                this.original_height = original_height;
            }

            public int getOriginal_width() {
                return original_width;
            }

            public void setOriginal_width(int original_width) {
                this.original_width = original_width;
            }

            public String getCopyright_commercial() {
                return copyright_commercial;
            }

            public void setCopyright_commercial(String copyright_commercial) {
                this.copyright_commercial = copyright_commercial;
            }

            public String getCopyright_modifications() {
                return copyright_modifications;
            }

            public void setCopyright_modifications(String copyright_modifications) {
                this.copyright_modifications = copyright_modifications;
            }

            public String getDate() {
                return date;
            }

            public void setDate(String date) {
                this.date = date;
            }

            public String getRegist_time() {
                return regist_time;
            }

            public void setRegist_time(String regist_time) {
                this.regist_time = regist_time;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }

            public String getOriginal_image_url() {
                return original_image_url;
            }

            public void setOriginal_image_url(String original_image_url) {
                this.original_image_url = original_image_url;
            }

            public String getThumbnail_image_url() {
                return thumbnail_image_url;
            }

            public void setThumbnail_image_url(String thumbnail_image_url) {
                this.thumbnail_image_url = thumbnail_image_url;
            }

            public String getLarge_tag() {
                return large_tag;
            }

            public void setLarge_tag(String large_tag) {
                this.large_tag = large_tag;
            }

            public String getMedium_tag() {
                return medium_tag;
            }

            public void setMedium_tag(String medium_tag) {
                this.medium_tag = medium_tag;
            }



        }
