package com.inno.ilyadmt.students.Models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mjazz on 08.06.2017.
 */
public class Group {
    private Long id;
    private List<Student> students;



    public Long getId() {
        return id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Group(Long id, List<Student> students) {
        this.id = id;
        this.students = students;
    }


    public void addStudent(Student student){
        this.students.add(student);
    }

    @Override
    public int hashCode() {
        return (int) (21+id*42);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Group)) return false;
        if (this.id != ((Group)obj).getId()) return false;
        return true;
    }
}
