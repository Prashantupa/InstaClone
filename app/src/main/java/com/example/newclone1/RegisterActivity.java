package com.example.newclone1;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

public class RegisterActivity extends AppCompatActivity {
    EditText edName, edEmail, edPassword, edcnfPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        edEmail = findViewById(R.id.edEmail);
        edPassword = findViewById(R.id.edPassword);
        edName =  findViewById(R.id.edName);
        edcnfPassword = findViewById(R.id.edcnfPassword);
    }

    //parse server register activity
    public void btn_register(View view){
        if (TextUtils.isEmpty(edName.getText())){
            edName.setError("Name is Required ");
        }else if (TextUtils.isEmpty(edEmail.getText())){
            edEmail.setError("Email is Required");
        }else if (TextUtils.isEmpty(edPassword.getText())){
            edPassword.setError("Password is Required");
        }else if (TextUtils.isEmpty(edcnfPassword.getText())){
            edcnfPassword.setError("Password is Required");
        }else if (!edPassword.getText().toString().equals(edcnfPassword.getText().toString())){
            Toast.makeText(RegisterActivity.this,"Password must same",Toast.LENGTH_SHORT).show();
        }else {

            final ProgressDialog progress = new ProgressDialog(this);
            progress.setMessage("Loading....");
            progress.show();

            ParseUser user = new ParseUser();
// Set the user's username and password, which can be obtained by a forms
            user.setUsername(edEmail.getText().toString().trim());
            user.setEmail(edEmail.getText().toString().trim());user.setPassword(edPassword.getText().toString());
            user.put("name", edName.getText().toString().trim());

            user.signUpInBackground(new SignUpCallback() {

                @Override
                public void done(ParseException e) {
                    progress.dismiss();
                    if (e == null) {
                        Toast.makeText(RegisterActivity.this,"Welcome!", Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                        startActivity(intent);
                        finish();

                    } else {
                        ParseUser.logOut();
                        Toast.makeText(RegisterActivity.this, e.getMessage(), Toast.LENGTH_LONG).show();
                    }
                }
            });


        }

    }
    // back to login layout from register layout
    public void back(View view){
        Intent intent = new Intent(RegisterActivity.this,LoginActivity.class);
        startActivity(intent);
    }
}
