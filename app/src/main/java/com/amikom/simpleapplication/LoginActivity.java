package com.amikom.simpleapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.rajapulau.projectview.until.PreferencesHelper;

public class LoginActivity extends AppCompatActivity {

    PrefernecesHelper instance;
    private EdiitText name;
    private EdiitText email;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
