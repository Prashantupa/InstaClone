package com.example.newclone1;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class FragmentGallery extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gallery_fragment);

        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_view);
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new
            BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    switch (menuItem.getItemId()){
                        case R.id.navigation_home:
                            Intent intent = new Intent(FragmentGallery.this,HomeActivity.class);
                            startActivity(intent);

                            break;

                        case R.id.navigation_Search:
                            Intent intent1 = new Intent(FragmentGallery.this,FragmentSearch.class);
                            startActivity(intent1);

                            break;

                        case R.id.navigation_gallery:
                            Intent intent2 = new Intent(FragmentGallery.this,FragmentGallery.class);
                            startActivity(intent2);

                            break;

                        case R.id.navigation_req:
                            Intent intent3 = new Intent(FragmentGallery.this,FragmentReq.class);
                            startActivity(intent3);

                            break;

                        case R.id.navigation_profile:
                            Intent intent4 = new Intent(FragmentGallery.this,FragmentProfile.class);
                            startActivity(intent4);

                            break;

                    }

                    return true;
                }
            };

}
