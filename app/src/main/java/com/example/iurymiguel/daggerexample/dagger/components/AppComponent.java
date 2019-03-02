package com.example.iurymiguel.daggerexample.dagger.components;

import com.example.iurymiguel.daggerexample.dagger.modules.MainActivityModule;
import com.example.iurymiguel.daggerexample.dagger.scopes.AppScope;
import com.example.iurymiguel.daggerexample.application.MyApplication;
import com.example.iurymiguel.daggerexample.dagger.modules.AppModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

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
