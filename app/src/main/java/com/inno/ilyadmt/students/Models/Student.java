package com.inno.ilyadmt.students.Models;

import java.io.*;
import java.util.*;

/**
 * Created by mjazz on 08.06.2017.
 */

public class Student extends Person implements Serializable{

    private Date dateOfBirth;
    public final Long id;
    private Long groupID;
    private String firstName;
    private String surname;
    private String secondName;
    private List<Contact> contacts;


    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGroupID(Long groupID) {
        this.groupID = groupID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Long getId() {
        return id;
    }

    public Long getGroupID() {
        return groupID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public Student(Date dateOfBirth, Long groupID, String firstName, String surname, String secondName) {
        this.dateOfBirth = dateOfBirth;
        this.groupID = groupID;
        this.firstName = firstName;
        this.surname = surname;
        this.secondName = secondName;
        this.id = System.currentTimeMillis()+ (int)Math.random()*100;
        this.contacts = new ArrayList<>();
    }

    @Override
    public int hashCode() {
        return (int) (21+id*42);
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student)obj;
        if (obj == null) return false;
        if (!(obj instanceof Student )) return false;
        if (this.id != ((Student)obj).getId()) return false;
        return this.getGroupID().equals(s.getGroupID())&&this.getId().equals(s.getGroupID());
    }

}
