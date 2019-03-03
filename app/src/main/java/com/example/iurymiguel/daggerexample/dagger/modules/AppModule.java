package com.example.iurymiguel.daggerexample.dagger.modules;

import com.example.iurymiguel.daggerexample.models.Person;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    public String provideDefaultName() {
        return "Iury";
    }

    @Provides
    public int provideDefaultAge() {
        return 23;
    }

    @Provides
    public Person providePerson(String name, int age) {
        return new Person(name, age);
    }
}
