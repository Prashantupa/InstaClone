package com.example.newclone1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.parse.ParseUser;

public class logout extends AppCompatActivity {

    Button logout;
    ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        progressBar=(ProgressBar)findViewById(R.id.progressBar);

        logout = (Button)findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ProgressDialog progress = new ProgressDialog(getApplicationContext());
                progress.setMessage("Loading...");
                progressBar.setVisibility(View.VISIBLE);
                ParseUser.logOut();
                Intent intent = new Intent(logout.this,LoginActivity.class);
                startActivity(intent);
                finish();
                progress.dismiss();
            }
        });
    }


}
