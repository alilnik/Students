package com.inno.ilyadmt.students.Activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.inno.ilyadmt.students.R;

/**
 * Created by mjazz on 20.06.2017.
 */

public class RegisterActivity extends Activity {

    Storage storage;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiry_register);
        storage = Storage.getInstance();
    }

    public void register_cancel(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }

    public void register_register(View view) {
        String login = ((EditText) findViewById(R.id.registration_login)).getText().toString();
        String pwd = ((EditText) findViewById(R.id.registration_pwd)).getText().toString();
        String pwd_rep = ((EditText) findViewById(R.id.registration_pwd_rep)).getText().toString();

        if(pwd.length()<8){
            Toast.makeText(this, "Password should be more than 8 characters long.\nCheck it, please.", Toast.LENGTH_LONG).show();
            return;
        }
        else if(!pwd.equals(pwd_rep)){
            Toast.makeText(this, "Passwords do not match.\nCheck, please.", Toast.LENGTH_LONG).show();
            return;
        }
        else if(storage.internalStorage.containsKey(login)){
            Toast.makeText(this, "This login is occupied already.\nConsider other, please.", Toast.LENGTH_LONG).show();
            return;
        }
        else{
            storage.internalStorage.put(login, pwd);
            startActivity(new Intent(this, MainActivity.class));
        }
    }
}
