package com.example.newclone1;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.parse.LogInCallback;
import com.parse.ParseException;
import com.parse.ParseUser;

public class LoginActivity extends AppCompatActivity {
    EditText edEmail, edPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        edEmail =  findViewById(R.id.edEmail);
        edPassword = findViewById(R.id.edPassword);
    }
    // login using parse
    public void login(View view) {
        if (TextUtils.isEmpty(edEmail.getText())) {
            edEmail.setError("Email is Required ");
        } else if (TextUtils.isEmpty(edPassword.getText())) {
            edPassword.setError("Password is Required");
        } else {
            final ProgressDialog progress = new ProgressDialog(this);
            progress.setMessage("Loading....");
            progress.show();
            ParseUser.logInInBackground(edEmail.getText().toString(), edPassword.getText().toString(), new LogInCallback() {
                @Override
                public void done(ParseUser parseuser, ParseException e) {
                    progress.dismiss();
                    if (parseuser != null) {
                        Toast.makeText(LoginActivity.this, "Welcome Back!", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(LoginActivity.this, HomeActivity.class);
                        startActivity(intent);
                        finish();
                    } else {
                        ParseUser.logOut();
                        Toast.makeText(LoginActivity.this, e.getMessage(), Toast.LENGTH_SHORT).show();

                    }
                }
            });

        }
    }
    // go to register activity from login activity
    public void register(View view) {
        Intent intent = new Intent(LoginActivity.this,RegisterActivity.class);
        startActivity(intent);

    }
    // Go to forget password reset layout
    public void forget(View view) {
        Intent intent = new Intent(LoginActivity.this,ResetActivity.class);
        startActivity(intent);
    }
}
