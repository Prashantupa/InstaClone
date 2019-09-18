package com.example.newclone1;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.parse.ParseException;
import com.parse.ParseUser;
import com.parse.RequestPasswordResetCallback;

public class ResetActivity extends AppCompatActivity {
    EditText edEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);

        edEmail = findViewById(R.id.edEmail);
    }
    //reset password parse server
    public void resetPassword(View view){
        if (TextUtils.isEmpty(edEmail.getText())) {
            edEmail.setError("Email is required");

        } else {
            ParseUser.requestPasswordResetInBackground(edEmail.getText().toString(), new RequestPasswordResetCallback() {
                @Override
                public void done(ParseException e) {
                    if (e == null) {

                        Toast.makeText(ResetActivity.this, "An email was successfully sent with Instruction", Toast.LENGTH_SHORT).show();

                    } else {
                        Toast.makeText(ResetActivity.this, " Something went Wrong:Retry", Toast.LENGTH_SHORT).show();

                    }
                }
            });
        }

    }

    // back to login layout from reset password/forget  layout
    public void back(View view){
        Intent intent = new Intent(ResetActivity.this,LoginActivity.class);
        startActivity(intent);
    }
}
