package com.inno.ilyadmt.students.Managers;

import com.inno.ilyadmt.students.Models.*;

import java.util.HashSet;
import java.util.List;

/**
 * Created by mjazz on 14.06.2017.
 */
public class GroupManager implements Manager{
    HashSet<Group> groups;

    public GroupManager() {
        groups = new HashSet<>();
    }

    @Override
    public void add(Object o) {
        groups.add((Group)o);
    }

    @Override
    public void addCollection(List<Object> list) {
        for(Object o: list){
            groups.add((Group)o);
        }
    }

    @Override
    public void remove(Object o) {
        if(groups.contains((Group) o)) groups.remove(o);
        else System.out.println("Group " + ((Group)o).getId() + " is not regirested in the system." );
    }

}
