package com.example.newclone1;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class BottomNavigationViewPager extends FragmentPagerAdapter {

    private final List<Fragment> mFragmentList = new ArrayList<>();


    public BottomNavigationViewPager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    public void addfragment(Fragment fragment){
        mFragmentList.add(fragment);

    }
}
