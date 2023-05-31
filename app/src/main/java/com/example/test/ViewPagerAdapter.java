package com.example.test;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.test.styling.NameFragment;

public class ViewPagerAdapter extends FragmentPagerAdapter {

    private Context myContext;
    int totalTabs;

    public ViewPagerAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    public Fragment getItem(int position){

        switch (position) {
            case 0:
                ThirdFragment homeFragment = new ThirdFragment();
                return homeFragment;
            case 1:
                NameFragment sportFragment = new NameFragment();
                return sportFragment;
            default:
                return null;
        }
//        Fragment fragment = null;
//        if (position == 0)
//            fragment = new NameFragment();
//        else if (position == 1)
//            fragment = new NameFragment();
//
//        return fragment;
    }

    public int getCount(){
        return totalTabs;
    }

    public CharSequence getPageTitle(int position){
        String title = null;
        if (position == 0) title = "Bulan Ini";
        else if (position == 1) title = "Semua";

        return title;
    }
//



}
