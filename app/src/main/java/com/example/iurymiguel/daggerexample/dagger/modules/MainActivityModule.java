package com.example.iurymiguel.daggerexample.dagger.modules;

import com.example.iurymiguel.daggerexample.dagger.subcomponents.MainActivitySubcomponent;
import com.example.iurymiguel.daggerexample.views.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

// Only used in classic way.
@Module(subcomponents = { MainActivitySubcomponent.class })
public abstract class MainActivityModule {
    @Binds
    @IntoMap
    @ClassKey(MainActivity.class)
    public abstract AndroidInjector.Factory<?> bindMainActivityInjectorFactory
            (MainActivitySubcomponent.Builder builder);
}
