package com.inno.ilyadmt.students.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.inno.ilyadmt.students.R;

public class MainActivity extends AppCompatActivity {

    String login;
    String pwd;
    Storage storage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent( this, StudentProfileActivity.class));
        storage = Storage.getInstance();
    }

    public void register(View view) {
        startActivity(new Intent(MainActivity.this, RegisterActivity.class));
    }

    public void login(View view) {
        login = ((EditText)findViewById(R.id.home_name)).getText().toString();
        pwd = ((EditText)findViewById(R.id.home_password)).getText().toString();

        if(checkPassword(login, pwd)) startActivity(new Intent(this, HelloActivity.class));
        else Toast.makeText(this, "Login or password is incorrect.\nCheck them, please.", Toast.LENGTH_LONG).show();
    }

    private boolean checkPassword(String user, String password){
        String localPassword = storage.internalStorage.get(user);
        if(localPassword != null){
            if(localPassword.equals(password)) return true;
            return false;
        }
        return false;

    }
}
