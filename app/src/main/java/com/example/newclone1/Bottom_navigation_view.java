package com.example.newclone1;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.MenuItem;
import android.widget.TextView;

public class Bottom_navigation_view extends AppCompatActivity {
    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {

            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);

                    break;
                case R.id.navigation_Search:
                    mTextMessage.setText(R.string.title_search);
                    break;
                case R.id.navigation_gallery:
                    mTextMessage.setText(R.string.title_gallery);
                    break;

                case R.id.navigation_req:
                 mTextMessage.setText(R.string.title_req);
                    break;

                case R.id.navigation_profile:

                    mTextMessage.setText(R.string.title_profile);
                    break;
            }


            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation_view);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        mTextMessage = findViewById(R.id.message);
       navView.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
