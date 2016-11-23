package com.example.toothpicktest;

import android.app.Application;

import toothpick.Toothpick;
import toothpick.smoothie.module.SmoothieApplicationModule;


public class App extends Application {
    public static final String APP_SCOPE = "app";

    @Override
    public void onCreate() {
        super.onCreate();

        Toothpick.openScope(APP_SCOPE).installModules(new SmoothieApplicationModule(this));
    }
}
