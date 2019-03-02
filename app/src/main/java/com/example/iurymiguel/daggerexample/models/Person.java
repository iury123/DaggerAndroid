package com.example.iurymiguel.daggerexample.models;

public class Person {

    private String name;
    private int age;

    public Person() {
        name =  "Iury";
        age = 24;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
