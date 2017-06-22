package com.inno.ilyadmt.students.Models;

/**
 * Created by mjazz on 08.06.2017.
 */
public class Contact {
    private String value;
    private ContactType type;

    public Contact(String value, ContactType type) {
        this.value = value;
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public ContactType getType() {
        return type;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setType(ContactType type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return (21+value.hashCode()*41)+(21+type.hashCode()*41);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if (!(obj instanceof Contact )) return false;
        if (this.type != ((Contact)obj).getType()) return false;
        if (this.value != ((Contact)obj).getValue()) return false;
        return true;
    }
}
