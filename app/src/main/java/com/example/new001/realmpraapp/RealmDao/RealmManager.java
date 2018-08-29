package com.example.new001.realmpraapp.RealmDao;

import io.realm.Realm;

public class RealmManager {

    private static Realm realm;
    {
        realm=Realm.getDefaultInstance();
    }

    private RealmManager() {}
    public static Realm getInstance(){
        if(realm==null){
        realm = Realm.getDefaultInstance();}
        return realm;
    }
}
