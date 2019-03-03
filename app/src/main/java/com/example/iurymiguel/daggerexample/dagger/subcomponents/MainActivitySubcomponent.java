package com.example.iurymiguel.daggerexample.dagger.subcomponents;
import com.example.iurymiguel.daggerexample.views.MainActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

// Only used in classic way.
@Subcomponent
public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
}
