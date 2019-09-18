package com.example.newclone1;

import android.content.Intent;
import android.os.Handler;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

  //  SharedPreferences sharedPreferences;  //for onw time intro only launch this uncomment shared pre code
   // Boolean firstTime;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

       //  sharedPreferences = getSharedPreferences("MyPrefs", MODE_PRIVATE);
        // firstTime = sharedPreferences.getBoolean("firstTime", true);

        //splash activity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
              /*  if (firstTime) {
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    firstTime = false;
                    editor.putBoolean("firstTime", firstTime);
                    editor.apply();*/
                    Intent intent = new Intent(SplashActivity.this, AppIntroActivity.class);
                    startActivity(intent);
                    finish();

                /*}else {
                        Intent intent = new Intent(SplashActivity.this,LoginActivity.class);
                        startActivity(intent);
                    }*/
            }
        },1000);
    }
}
