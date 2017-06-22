package com.inno.ilyadmt.students.Managers;

import com.inno.ilyadmt.students.Models.*;

import java.util.HashSet;
import java.util.List;

/**
 * Created by mjazz on 14.06.2017.
 */
public class JournalManager implements Manager{

    HashSet<Journal> journals;

    public JournalManager() {
        journals = new HashSet<>();
    }

    @Override
    public void add(Object o) {
        journals.add((Journal)o);
    }

    @Override
    public void addCollection(List<Object> list) {
        for(Object o: list){
            journals.add((Journal)o);
        }
    }

    @Override
    public void remove(Object o) {
        if(journals.contains((Journal) o)) journals.remove(o);
        else System.out.println("Journal for lesson " + ((Journal)o).getLesson().getName() + " is not regirested in the system." );
    }
}
