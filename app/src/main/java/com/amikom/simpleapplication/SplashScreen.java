package com.amikom.simpleapplication;


import android.content.Intent;
import android.preference.Preference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.amikom.simpleapplication.util.PreferencesHelper;

import java.util.logging.Handler;


public class SplashScreen extends AppCompatActivity {
    PreferencesHelper instance;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        instance = PreferencesHelper.getInstance(getApplicationContext());
        int splashInterval = 10;
        new Handler().postDelayed(new Runnable (){
            @Override
            public void run() {
                if (!instance.isLogin()) {
                    startActivity(new Intent(SplashScreen.this, LoginActivity.class));
                } else {
                    startActivity(new Intent(SplashScreen.this, MainActivity.class));
                }
            }

        });
    }
}
