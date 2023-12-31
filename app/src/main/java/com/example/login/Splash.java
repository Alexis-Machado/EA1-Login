package com.example.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class Splash extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, login.class);
                startActivity(intent);
                finish();
            }
        };

        Timer tiempo = new Timer();
        tiempo.schedule(tarea, 5000);
    }
}