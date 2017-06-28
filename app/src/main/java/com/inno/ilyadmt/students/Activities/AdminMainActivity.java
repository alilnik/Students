package com.inno.ilyadmt.students.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.inno.ilyadmt.students.R;

/**
 * Created by mjazz on 26.06.2017.
 */

public class AdminMainActivity extends Activity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administration_main);
    }


    public void getJournalsList(View view) {
    }

    public void getGroupsList(View view) {
    }

    public void getStudentsList(View view) {
        startActivity(new Intent(this, StudentListActivity.class));
    }
}
