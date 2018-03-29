package com.example.skybreaker.lab5_hartzell;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by SkyBreaker on 3/15/2018.
 */

@Database(entities = {Person.class}, version = 1)

public abstract class LabDatabase extends RoomDatabase {

    public abstract PersonDao personDao();

}

