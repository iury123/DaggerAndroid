package com.example.iurymiguel.daggerexample.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.iurymiguel.daggerexample.R;
import com.example.iurymiguel.daggerexample.models.Person;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

public class MainActivity extends DaggerAppCompatActivity {

    @Inject
    public Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
//        AndroidInjection.inject(this);  // only if extends AppCompatActivity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(person != null) {
            Person p = person;
        }

    }
}
