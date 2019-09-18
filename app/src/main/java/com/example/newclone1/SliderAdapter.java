package com.example.newclone1;

import android.content.Context;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SliderAdapter extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter (Context context) {
        this.context = context;
    }


    public int[] slide_images = {
            R.drawable.conversation,
            R.drawable.image,
            R.drawable.profilelike,

    };
    public String[] slide_headings = {
            "Chat with frnds/family",
            "Likes/Comment on Dp",
            "Visit the Profile",

    };
    public  String[] slide_description = {
            "Chat with friends , Family, Relatives, Anytime, Anywhere, 24 * 7 ",
            "Chat with friends , Family, Relatives, Anytime, Anywhere, 24 * 7",
            "Chat with friends , Family, Relatives, Anytime, Anywhere, 24 * 7",

    };


    @Override
    public int getCount() {
        return slide_headings.length;
    }
    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.activity_slide,container,false);

        ImageView slideImageView = (ImageView)view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView)view.findViewById(R.id.slide_heading);
        TextView slideDescription = (TextView)view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_headings[position]);
        slideDescription.setText(slide_description[position]);
        container.addView(view);
        return view;

    }

    @Override
    public void destroyItem(ViewGroup container, int position,Object object) {
        container.removeView((RelativeLayout)object);
    }
}
