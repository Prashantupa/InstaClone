package com.example.newclone1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class FragmentProfile extends AppCompatActivity {

    GridView gridView;

    //Images
    Integer[] imageIds = {R.drawable.profilepic,R.drawable.panda,R.drawable.doremon,
            R.drawable.jarvis,R.drawable.krishna,R.drawable.bird,R.drawable.bheem,R.drawable.boy,R.drawable.elephant,
            R.drawable.hero,R.drawable.cartoon,R.drawable.fatu,
            R.drawable.girl,R.drawable.officer,R.drawable.snap,
            R.drawable.tom,R.drawable.suu,R.drawable.showicon,
            R.drawable.ic_camera,R.drawable.insta,R.drawable.officer,
            R.drawable.profilepic,R.drawable.girl,R.drawable.doremon};

    ImageView imageView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile_fragment);

        // grid view for Images in profile activity
          gridView = (GridView)findViewById(R.id.gridView);
          gridView.setAdapter(new ImageAdapter(getApplicationContext()));

          gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }});



          imageView = (ImageView) findViewById(R.id.profileMenu);
          imageView.setOnClickListener(new View.OnClickListener() {         @Override
            public void onClick(View v) {
                Intent intent = new Intent(FragmentProfile.this, SettingProfile.class);
                startActivity(intent);
            }
        });


        BottomNavigationView bottomNavigationView = findViewById(R.id.nav_view); //bottomNavi
        bottomNavigationView.setOnNavigationItemSelectedListener(navListener);
    }

       public class ImageAdapter extends BaseAdapter {  //Grid view image adapter
           private Context mContext;

           public ImageAdapter(Context c){
               mContext=c;

           }

        @Override
          public int getCount() {
            return imageIds.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override public View getView(int position, View convertView, ViewGroup parent) {
           ImageView mImageView;
           if (convertView == null){
               mImageView = new ImageView(mContext);
               mImageView.setLayoutParams(new GridView.LayoutParams(250,250));
                mImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                mImageView.setPadding(0,0,0,0);
            }else {
                mImageView = (ImageView)convertView;
           }
           mImageView.setImageResource(imageIds[position]);
            return mImageView;
       }
   }

    // BottomNavigation View
    private BottomNavigationView.OnNavigationItemSelectedListener navListener = new
            BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                    switch (menuItem.getItemId()) {
                        case R.id.navigation_home:
                            Intent intent = new Intent(FragmentProfile.this, HomeActivity.class);
                            startActivity(intent);

                            break;

                        case R.id.navigation_Search:
                            Intent intent1 = new Intent(FragmentProfile.this, FragmentSearch.class);
                            startActivity(intent1);

                            break;

                        case R.id.navigation_gallery:
                            Intent intent2 = new Intent(FragmentProfile.this, FragmentGallery.class);
                            startActivity(intent2);

                            break;

                        case R.id.navigation_req:
                            Intent intent3 = new Intent(FragmentProfile.this, FragmentReq.class);
                            startActivity(intent3);

                            break;

                        case R.id.navigation_profile:
                            Intent intent4 = new Intent(FragmentProfile.this, FragmentProfile.class);
                            startActivity(intent4);

                            break;

                    }

                    return true;
                }
            };

}
