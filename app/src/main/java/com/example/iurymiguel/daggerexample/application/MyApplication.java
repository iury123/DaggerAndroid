package com.example.iurymiguel.daggerexample.application;

import com.example.iurymiguel.daggerexample.dagger.components.DaggerAppComponent;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class MyApplication extends DaggerApplication {

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return DaggerAppComponent
                .builder()
                .application(this)
                .build();
    }
}


/*
    //Classic way

    // MyApplication extending Application and implementing HasActivityInjector.

    @Inject
    public DispatchingAndroidInjector<Activity> activityInjector;


    @Override
    public void onCreate() {
        super.onCreate();
        DaggerAppComponent.builder().build().inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return activityInjector;
    }
*/