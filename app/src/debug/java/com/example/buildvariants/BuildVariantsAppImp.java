package com.example.buildvariants;

import android.util.Log;

/**
 * Created by Anand on 22/09/2016.
 */
public class BuildVariantsAppImp extends BuildVariantsApp {
    @Override
    protected void init() {
        Log.v("BuildVariantsAppImp", "init: Debug Variant");
    }
}
