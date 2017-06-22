package com.inno.ilyadmt.students.Managers;

import com.inno.ilyadmt.students.Models.Person;


import java.util.List;

/**
 * Created by mjazz on 14.06.2017.
 */
public interface Manager {
    void add(Object o);
    void addCollection(List<Object> list);
    void remove(Object o);

}
