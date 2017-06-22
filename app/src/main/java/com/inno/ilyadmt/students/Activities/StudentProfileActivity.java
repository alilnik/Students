package com.inno.ilyadmt.students.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.inno.ilyadmt.students.Adapters.ContactsAdapter;
import com.inno.ilyadmt.students.Adapters.JournalsAdapter;
import com.inno.ilyadmt.students.Models.Contact;
import com.inno.ilyadmt.students.Models.ContactType;
import com.inno.ilyadmt.students.Models.Group;
import com.inno.ilyadmt.students.Models.Journal;
import com.inno.ilyadmt.students.Models.Lesson;
import com.inno.ilyadmt.students.Models.Student;
import com.inno.ilyadmt.students.R;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by mjazz on 22.06.2017.
 */

public class StudentProfileActivity extends Activity {

    private List<Journal> journalList;
    private Student student;
    private List<Contact> contactList;
    private RecyclerView recyclerViewContacts;
    private RecyclerView recyclerViewJournals;
    private ContactsAdapter contactsAdapter;
    private JournalsAdapter journalsAdapter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        fillContacts();
        fillJournals();
        setContentView(R.layout.activity_student_profile);

        recyclerViewContacts = (RecyclerView) findViewById(R.id.contacts_recycle);
        contactsAdapter = new ContactsAdapter(contactList);
        RecyclerView.LayoutManager contactLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewContacts.setLayoutManager(contactLayoutManager);
        recyclerViewContacts.setItemAnimator(new DefaultItemAnimator());
        recyclerViewContacts.setAdapter(contactsAdapter);

        recyclerViewJournals = (RecyclerView)findViewById(R.id.journals_recycle);
        journalsAdapter = new JournalsAdapter(journalList, student);
        RecyclerView.LayoutManager journalLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewJournals.setLayoutManager(journalLayoutManager);
        recyclerViewJournals.setItemAnimator(new DefaultItemAnimator());
        recyclerViewJournals.setAdapter(journalsAdapter);



    }

    private void fillContacts(){
        contactList = new ArrayList<>();
        contactList.add(new Contact("8991643412", ContactType.PHONE));
        contactList.add(new Contact("8991643413", ContactType.PHONE));
        contactList.add(new Contact("8991643415", ContactType.PHONE));
        contactList.add(new Contact("8991643415", ContactType.PHONE));
        contactList.add(new Contact("@ildmi", ContactType.TELEGRAM));
        contactList.add(new Contact("@vdrobny", ContactType.TELEGRAM));
        contactList.add(new Contact("@ssolonest", ContactType.TELEGRAM));
        contactList.add(new Contact("8991643412", ContactType.PHONE));
        contactList.add(new Contact("8991643413", ContactType.PHONE));
        contactList.add(new Contact("8991643415", ContactType.PHONE));
        contactList.add(new Contact("8991643415", ContactType.PHONE));
        contactList.add(new Contact("@ildmi", ContactType.TELEGRAM));
        contactList.add(new Contact("@vdrobny", ContactType.TELEGRAM));
        contactList.add(new Contact("@ssolonest", ContactType.TELEGRAM));
        contactList.add(new Contact("8991643412", ContactType.PHONE));
        contactList.add(new Contact("8991643413", ContactType.PHONE));
        contactList.add(new Contact("8991643415", ContactType.PHONE));
        contactList.add(new Contact("8991643415", ContactType.PHONE));
        contactList.add(new Contact("@ildmi", ContactType.TELEGRAM));
        contactList.add(new Contact("@vdrobny", ContactType.TELEGRAM));
        contactList.add(new Contact("@ssolonest", ContactType.TELEGRAM));
    }
    private void fillJournals(){
        student = new Student(new Date(), 15L, "Ilya", "Dmitrenok", "Alex");
        final Student s2 = new Student(new Date(), 15L, "Nik", "Dmitrenok", "Alexandr");
        final Lesson l1 = new Lesson(
                "Java", new Date(), new Date(),
                "3521", "Java", "Android Programming", "Artem P.",
                new Group(15L, new ArrayList<Student>(){{
                    add(student);
                    add(s2);
                }})
        );
        final Lesson l2 = new Lesson(
                "Programming", new Date(), new Date(),
                "352", "Java", "Java Programming", "Artem P.",
                new Group(15L, new ArrayList<Student>(){{
                    add(student);
                    add(s2);
                }})
        );
        journalList = new ArrayList<Journal>(){{
            add(new Journal(l1));
            add(new Journal(l2));
        }};
        journalList.get(0).addPresentStudents(new ArrayList<Student>(){{
            add(student);
            add(s2);
        }});
        journalList.get(1).addPresentStudents(new ArrayList<Student>(){{
            add(student);
            add(s2);
        }});
    }
}
