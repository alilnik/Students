package com.inno.ilyadmt.students.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.inno.ilyadmt.students.Adapters.StudentsAdapter;
import com.inno.ilyadmt.students.Models.Student;
import com.inno.ilyadmt.students.R;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by mjazz on 28.06.2017.
 */

public class StudentListActivity extends Activity {

    private List<Student> studentList;
    private StudentsAdapter studentsAdapter;
    private RecyclerView recyclerViewStudents;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fillStudents();
        setContentView(R.layout.activity_students_list);

        recyclerViewStudents = (RecyclerView)findViewById(R.id.students_recycle);
        studentsAdapter = new StudentsAdapter(studentList);
        RecyclerView.LayoutManager studLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewStudents.setLayoutManager(studLayoutManager);
        recyclerViewStudents.setItemAnimator(new DefaultItemAnimator());
        recyclerViewStudents.setAdapter(studentsAdapter);
    }

    private void fillStudents(){
        studentList = new ArrayList<>();
        studentList.add(new Student(new Date(), 15L, "Ilya", "Dmitrenok", "Alex"));
        studentList.add(new Student(new Date(), 15L, "Victor", "Drobny", "Igor"));
        studentList.add(new Student(new Date(), 15L, "Sergey", "Solonets", "Victor"));
        studentList.add(new Student(new Date(), 10L, "Lesya", "Shafirova", "Nicolay"));
        studentList.add(new Student(new Date(), 33L, "Alex", "Malyavka", "Sergey"));
        studentList.add(new Student(new Date(), 33L, "Matvey", "Nazarov", "Alex"));
        studentList.add(new Student(new Date(), 15L, "Ilya", "Dmitrenok", "Alex"));
        studentList.add(new Student(new Date(), 15L, "Victor", "Drobny", "Igor"));
        studentList.add(new Student(new Date(), 15L, "Sergey", "Solonets", "Victor"));
        studentList.add(new Student(new Date(), 10L, "Lesya", "Shafirova", "Nicolay"));
        studentList.add(new Student(new Date(), 33L, "Alex", "Malyavka", "Sergey"));
        studentList.add(new Student(new Date(), 33L, "Matvey", "Nazarov", "Alex"));
        studentList.add(new Student(new Date(), 15L, "Ilya", "Dmitrenok", "Alex"));
        studentList.add(new Student(new Date(), 15L, "Victor", "Drobny", "Igor"));
        studentList.add(new Student(new Date(), 15L, "Sergey", "Solonets", "Victor"));
        studentList.add(new Student(new Date(), 10L, "Lesya", "Shafirova", "Nicolay"));
        studentList.add(new Student(new Date(), 33L, "Alex", "Malyavka", "Sergey"));
        studentList.add(new Student(new Date(), 33L, "Matvey", "Nazarov", "Alex"));
        studentList.add(new Student(new Date(), 15L, "Ilya", "Dmitrenok", "Alex"));
        studentList.add(new Student(new Date(), 15L, "Victor", "Drobny", "Igor"));
        studentList.add(new Student(new Date(), 15L, "Sergey", "Solonets", "Victor"));
        studentList.add(new Student(new Date(), 10L, "Lesya", "Shafirova", "Nicolay"));
        studentList.add(new Student(new Date(), 33L, "Alex", "Malyavka", "Sergey"));
        studentList.add(new Student(new Date(), 33L, "Matvey", "Nazarov", "Alex"));
        studentList.add(new Student(new Date(), 15L, "Ilya", "Dmitrenok", "Alex"));
        studentList.add(new Student(new Date(), 15L, "Victor", "Drobny", "Igor"));
        studentList.add(new Student(new Date(), 15L, "Sergey", "Solonets", "Victor"));
        studentList.add(new Student(new Date(), 10L, "Lesya", "Shafirova", "Nicolay"));
        studentList.add(new Student(new Date(), 33L, "Alex", "Malyavka", "Sergey"));
        studentList.add(new Student(new Date(), 33L, "Matvey", "Nazarov", "Alex"));

    }
}
