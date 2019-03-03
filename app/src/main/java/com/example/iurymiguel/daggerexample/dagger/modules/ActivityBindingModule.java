package com.example.iurymiguel.daggerexample.dagger.modules;

import com.example.iurymiguel.daggerexample.views.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

// Only Used in the new way.
@Module
public abstract class ActivityBindingModule {

    @ContributesAndroidInjector
    abstract MainActivity mainActivity();
}
