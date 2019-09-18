package com.example.newclone1;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.Timer;
import java.util.TimerTask;

public class AppIntroActivity extends AppCompatActivity {
    private ViewPager mSlideViewPager;
    LinearLayout mDotLayout;
    private TextView[] mDots;

    private SliderAdapter sliderAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_intro);

        mSlideViewPager = (ViewPager) findViewById(R.id.slide_viewPager);
        mDotLayout = (LinearLayout) findViewById(R.id.dotslayout);

        sliderAdapter = new SliderAdapter(this);

        mSlideViewPager.setAdapter(sliderAdapter);
        mSlideViewPager.setCurrentItem(0);
        addDotsIndicater(0);
        mSlideViewPager.addOnPageChangeListener(viewlistener);

//timer for auto slide
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new MyTimer(), 1000, 2000);

    }


    public class MyTimer extends TimerTask {
        @Override
        public void run() {
            AppIntroActivity.this.runOnUiThread(new Runnable() {


                @Override
                public void run() {

                    if (mSlideViewPager.getCurrentItem() == 0) {
                        mSlideViewPager.setCurrentItem(1);

                    } else if (mSlideViewPager.getCurrentItem() == 1) {
                        mSlideViewPager.setCurrentItem(2);
                    } else {
                        mSlideViewPager.setCurrentItem(0);
                    }

                }
            });

        }
    }
    // dots fr slide
    private void addDotsIndicater ( int position){
        mDots = new TextView[3];
        mDotLayout.removeAllViews();

        for (int i = 0; i < mDots.length; i++) {

            mDots[i] = new TextView(this);
            mDots[i].setText(Html.fromHtml("&#8226"));
            mDots[i].setTextSize(35);
            mDots[i].setTextColor(getResources().getColor(R.color.white));


            mDotLayout.addView(mDots[i]);

        }

        if (mDots.length > 0) {
            mDots[position].setTextColor(getResources().getColor(R.color.colorAccent));
        }

    }

    ViewPager.OnPageChangeListener viewlistener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {
        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicater(i);
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }

    };
    //skip to login
    public void skip (View view){
        Intent intent = new Intent(AppIntroActivity.this, LoginActivity.class);
        startActivity(intent);

    }
    }

