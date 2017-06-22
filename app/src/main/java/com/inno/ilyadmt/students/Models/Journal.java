package com.inno.ilyadmt.students.Models;



import android.util.Pair;

import java.util.*;

/**
 * Created by mjazz on 08.06.2017.
 */
public class Journal {
    private Lesson lesson;
    private HashMap<Student, Boolean> journal;

    public Journal(Lesson lesson) {
        this.journal = new HashMap<>();
        this.lesson = lesson;
    }

    public Lesson getLesson() {
        return lesson;
    }

    public HashMap<Student, Boolean> getJournal() {
        return journal;
    }

    public void addStudent(Student student, Boolean presence)
    {
        journal.put(student, presence);
    }

    public void addPresentStudents(List<Student> students){
        for(Student s: students){
            journal.put(s, true);
        }
    }

    public void addStudents(List<Pair<Student, Boolean>> students){
        for(Pair p: students){
            journal.put((Student)p.first, (Boolean)p.second);
        }
    }

    public void addStudents(List<Student> students, List<Boolean> presence){
        if(students.size()!=presence.size()){
            System.out.println("ERROR! Lists of presence and students do not match on their length.");
            IllegalArgumentException e = new IllegalArgumentException();
            throw e;
        }
        for(int i = 0; i < students.size(); i++){
            journal.put(students.get(i), presence.get(i));
        }
    }

    @Override
    public String toString() {
        String s = new String("");
        for(Map.Entry<Student, Boolean> entry: journal.entrySet()){
            s+=entry.getKey().getSurname()+" "+ entry.getKey().getFirstName()+ " " +entry.getKey().getGroupID()+ ": " + entry.getValue()+";\n";
        }

        return s;
    }

    @Override
    public int hashCode() {
        return 41+lesson.hashCode()*41;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Journal)) return false;
        if (!(lesson.equals(obj))) return false;
        return true;
    }


}
