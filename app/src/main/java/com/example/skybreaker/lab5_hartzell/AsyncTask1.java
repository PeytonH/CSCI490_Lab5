package com.example.skybreaker.lab5_hartzell;

/**
 * Created by SkyBreaker on 3/15/2018.
 */
import android.content.Context;
import android.os.AsyncTask;
import java.util.ArrayList;

class MyAsyncTask extends AsyncTask<String, Void, Void>{
    LabDatabase database;

    public MyAsyncTask(LabDatabase database, Context applicationContext)
    {
        this.database = database;
    }

    @Override
    protected Void doInBackground(String... strings) {
        Person person = new Person();
        person.setName(strings[0]);
        database.personDao().insertPerson(person);
        return null;
    }
}