package com.bawei.wushuai20200317.base;

import android.app.Application;
import android.content.Context;

public class App extends Application {
    private static Context applicationContext;

    @Override
    public void onCreate() {
        super.onCreate();
        applicationContext = getApplicationContext();
    }

    public  static Context getAppContext() {
        return applicationContext;
    }
}
