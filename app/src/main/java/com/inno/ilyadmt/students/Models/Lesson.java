package com.inno.ilyadmt.students.Models;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by mjazz on 08.06.2017.
 */
public class Lesson {
    private String name;
    private Date timeFrom, timeTo;
    private String room;
    private String description;
    private String subject;
    private String lector;
    private List<Group> groupList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTimeFrom() {
        return timeFrom;
    }

    public void setTimeFrom(Date timeFrom) {
        this.timeFrom = timeFrom;
    }

    public Date getTimeTo() {
        return timeTo;
    }

    public void setTimeTo(Date timeTo) {
        this.timeTo = timeTo;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getLector() {
        return lector;
    }

    public void setLector(String lector) {
        this.lector = lector;
    }

    public List<Group> getGroupList() {
        return groupList;
    }

    public void setGroupList(List<Group> groupList) {
        this.groupList = groupList;
    }

    public Lesson(String name, Date timeFrom, Date timeTo, String room, String description, String subject, String lector, List<Group> groupList) {
        this.name = name;
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
        this.room = room;
        this.description = description;
        this.subject = subject;
        this.lector = lector;
        this.groupList = groupList;
    }

    public Lesson(String name, Date timeFrom, Date timeTo, String room, String description, String subject, String lector, final Group group) {
        this.name = name;
        this.timeFrom = timeFrom;
        this.timeTo = timeTo;
        this.room = room;
        this.description = description;
        this.subject = subject;
        this.lector = lector;
        this.groupList = new ArrayList<Group>(){{
            add(group);
        }};
    }

    @Override
    public int hashCode() {
        return 41+name.hashCode()*41;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Lesson)) return false;
        if (this.getTimeFrom() != ((Lesson)obj).getTimeFrom() && this.getTimeTo() != ((Lesson)obj).getTimeFrom() && this.getRoom() != ((Lesson)obj).getRoom()) return false;
        return true;
    }
}
