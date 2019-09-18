package com.example.newclone1;


import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;


public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);



     // BottomNavigationView bottomNavigationView = findViewById(R.id.nav_view);
     // bottomNavigationView.setOnNavigationItemSelectedListener(navListener);




      setupViewPager();
       // setupBottomViewPager();


    }


  /*  private void setupBottomViewPager() {
        BottomNavigationViewPager adapter = new BottomNavigationViewPager(getSupportFragmentManager());
        adapter.addfragment(new FragmentHome());
        adapter.addfragment(new FragmentSearch());
        adapter.addfragment(new FragmentGallery());
        adapter.addfragment(new FragmentReq());
        adapter.addfragment(new FragmentProfile());
        ViewPager viewPager = (ViewPager) findViewById(R.id.container);
        viewPager.setAdapter(adapter);

    }*/




   /*private BottomNavigationView.OnNavigationItemSelectedListener navListener = new
            BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    switch (menuItem.getItemId()){
                        case R.id.navigation_home:
                            Intent intent = new Intent(HomeActivity.this,FragmentHome.class);
                            startActivity(intent);

                            break;

                        case R.id.navigation_Search:
                            Intent intent1 = new Intent(HomeActivity.this,FragmentSearch.class);
                            startActivity(intent1);

                            break;

                        case R.id.navigation_gallery:
                            Intent intent2 = new Intent(HomeActivity.this,FragmentGallery.class);
                            startActivity(intent2);

                            break;

                        case R.id.navigation_req:
                            Intent intent3 = new Intent(HomeActivity.this,FragmentReq.class);
                            startActivity(intent3);

                            break;

                        case R.id.navigation_profile:
                            Intent intent4 = new Intent(HomeActivity.this,FragmentProfile.class);
                            startActivity(intent4);

                            break;

                    }

                    return true;
                }
            };*/


  private void setupViewPager() {
      SectionPageAdapter adapter = new SectionPageAdapter(getSupportFragmentManager());
      adapter.addFragment(new FragmentCamera());
      adapter.addFragment(new FragmentNews());
      adapter.addFragment(new FragmentMessage());
      ViewPager viewPager = (ViewPager) findViewById(R.id.container);
      viewPager.setAdapter(adapter);


      TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
      tabLayout.setupWithViewPager(viewPager);

      tabLayout.getTabAt(0).setIcon(R.drawable.ic_camera);
      tabLayout.getTabAt(1).setIcon(R.drawable.ic_logoname);
      tabLayout.getTabAt(2).setIcon(R.drawable.ic_arrow);
  }

}