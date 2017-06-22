package com.inno.ilyadmt.students.Managers;

import com.inno.ilyadmt.students.Models.*;

import java.util.List;

/**
 * Created by mjazz on 14.06.2017.
 */
public class SystemManager {

    private StudentManager studentManager;
    private JournalManager journalManager;
    private GroupManager groupManager;

    public SystemManager() {
        studentManager =  new StudentManager();
        journalManager =  new JournalManager();
        groupManager = new GroupManager();
    }

    public void addStudents(List<Object> students){
        studentManager.addCollection(students);
    }

    public void addStudent(Student s){
        studentManager.add(s);
        groupManager.add(s);
    }


}
