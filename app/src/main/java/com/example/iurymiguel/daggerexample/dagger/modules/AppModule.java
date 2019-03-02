package com.example.iurymiguel.daggerexample.dagger.modules;

import com.example.iurymiguel.daggerexample.models.Person;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Singleton
    @Provides
    public Person providePerson() {
        return new Person();
    }
}
