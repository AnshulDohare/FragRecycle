package com.anshul.fragrecycle;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {
    public static ArrayList<Person>people;
    @Override
    public void onCreate() {
        super.onCreate();
        people = new ArrayList<Person>();
        people.add(new Person("Anshul Dohare","9575274530"));
        people.add(new Person("Johan Tagore","9978324576"));
        people.add(new Person("Nelson Mandela","7004567231"));
        people.add(new Person("David Dhawan","9568262487"));
    }
}
