package com.inno.ilyadmt.students.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.inno.ilyadmt.students.R;
import com.inno.ilyadmt.students.Utilities.ROLES;
import com.inno.ilyadmt.students.Utilities.Storage;

public class LoginActivity extends AppCompatActivity {

    String login;
    String pwd;
    Storage storage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        startActivity(new Intent( this, StudentProfileActivity.class));
        storage = Storage.getInstance();
        storage.internalStorage.put("1", new Pair<String, ROLES>("1", ROLES.ADMIN));
    }

    public void register(View view) {
        startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
    }

    public void login(View view) {
        login = ((EditText)findViewById(R.id.home_name)).getText().toString();
        pwd = ((EditText)findViewById(R.id.home_password)).getText().toString();
        ROLES role;

        if((role = checkPassword(login, pwd))!=null){
            if(role.equals(ROLES.USER)){
                startActivity(new Intent(this, StudentProfileActivity.class));
            }
            else startActivity(new Intent(this, AdminMainActivity.class));

        }
        else Toast.makeText(this, "Login or password is incorrect.\nCheck them, please.", Toast.LENGTH_LONG).show();
    }

    private ROLES checkPassword(String user, String password){
        String localPassword = storage.internalStorage.get(user).first;
        if(localPassword != null){
            if(localPassword.equals(password)) return storage.internalStorage.get(user).second;
        }
        return null;

    }
}
