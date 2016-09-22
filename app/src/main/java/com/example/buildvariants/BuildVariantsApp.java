package com.example.buildvariants;

import android.app.Application;

/**
 * Created by Anand on 22/09/2016.
 */
public abstract class BuildVariantsApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        init();
    }

    protected abstract void init();
}
