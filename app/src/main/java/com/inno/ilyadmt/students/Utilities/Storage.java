package com.inno.ilyadmt.students.Utilities;

import android.util.Pair;

import java.util.HashMap;

/**
 * Created by mjazz on 20.06.2017.
 */

public class Storage {
    public HashMap<String, Pair<String, ROLES>> internalStorage = new HashMap<>();

    private static final Storage ourInstance = new Storage();

    public static Storage getInstance() {
        return ourInstance;
    }

    private Storage() {
    }
}
