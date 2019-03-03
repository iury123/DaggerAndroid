package com.example.iurymiguel.daggerexample.dagger.components;

import android.app.Application;

import com.example.iurymiguel.daggerexample.application.MyApplication;
import com.example.iurymiguel.daggerexample.dagger.modules.ActivityBindingModule;
import com.example.iurymiguel.daggerexample.dagger.modules.AppModule;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/*

// Classic way.

// Componente da aplicação toda deve ter todos os módulos.
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        MainActivityModule.class
})
@AppScope
public interface AppComponent {
    void inject(MyApplication application);
}

*/

@Component(modules =
        {
                AppModule.class,
                ActivityBindingModule.class,
                AndroidSupportInjectionModule.class
        })
public interface AppComponent extends AndroidInjector<MyApplication> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        AppComponent.Builder application(Application application);
        AppComponent build();
    }
}