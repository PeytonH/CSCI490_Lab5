package com.example.skybreaker.lab5_hartzell;

/**
 * Created by SkyBreaker on 3/15/2018.
 */
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import java.util.ArrayList;

class MyAsyncTask2 extends AsyncTask<Void, Void, ArrayList<Person>> {
    LabDatabase personDB;
    Context context;

    public MyAsyncTask2(LabDatabase personDB, Context context)
    {
        this.personDB = personDB;
        this.context = context;
    }

    @Override
    protected void onPostExecute(ArrayList<Person> persons) {
        super.onPostExecute(persons);

        ArrayList<String> personNames = new ArrayList<>();
        for (Person p : persons) {
            personNames.add(p.getName());
        }

        Intent i = new Intent(context, PersonsActivity.class);
        i.putExtra("Persons", personNames);
        context.startActivity(i);
    }

    @Override
    protected ArrayList<Person> doInBackground(Void... voids) {
        ArrayList<Person> persons = (ArrayList) personDB.personDao().getAllPersons();
        return persons;
    }
}