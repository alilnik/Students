package com.inno.ilyadmt.students.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.inno.ilyadmt.students.R;

/**
 * Created by mjazz on 20.06.2017.
 */

public class HelloActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello);
    }

    public void logout(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
