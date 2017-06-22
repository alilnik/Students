package com.inno.ilyadmt.students.Managers;

import com.inno.ilyadmt.students.Models.*;

import java.util.HashSet;
import java.util.List;

/**
 * Created by mjazz on 14.06.2017.
 */
public class StudentManager implements Manager {

    private HashSet<Student> students;

    public StudentManager(){
        students = new HashSet<>();
    }

    @Override
    public void add(Object o) {
        students.add((Student)o);
    }

    @Override
    public void addCollection(List<Object> objects) {
        for(Object o: objects){
            students.add((Student)o);
        }
    }

    @Override
    public void remove(Object o) {
        if(students.contains((Student)o)) students.remove(o);
        else System.out.println("Student " + ((Student)o).getId() + " is not regirested in the system." );
    }
}
