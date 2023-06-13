package com.appdorms.absensi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.appdorms.absensi.R;
import com.appdorms.absensi.styling.NameFragment;
import com.google.android.material.tabs.TabLayout;

public class SecondFragment extends Fragment {

    View view;

    TabLayout tabLayout;
    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

//    TabLayout tabLayout;
    FrameLayout frameLayout;
    Fragment fragment = null;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_second, container, false);

//        tabLayout = getView().findViewById(R.id.tab_layout);
        tabLayout = view.findViewById(R.id.tab_layout);
        frameLayout = view.findViewById(R.id.frame_layout);


//
        tabLayout.addTab(tabLayout.newTab().setText("Bulan Ini"));
        tabLayout.addTab(tabLayout.newTab().setText("Semua"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        fragment = new NameFragment();
        fragmentManager = getParentFragmentManager();
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout, fragment);
        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        fragmentTransaction.commit();

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                // Fragment fragment = null;
                switch (tab.getPosition()) {
                    case 0:
                        fragment = new NameFragment();
                        break;
                    case 1:
                        fragment = new NameFragment();
                        break;
                }
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.frame_layout, fragment);
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.commit();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


//        viewPager = getView().findViewById(R.id.view_pager);
//        tabLayout = getView().findViewById(R.id.tab_layout);
//
//        tabLayout.addTab(tabLayout.newTab().setText("Bulan Ini"));
//        tabLayout.addTab(tabLayout.newTab().setText("Semua"));
//        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);
//
//        viewPagerAdapter = new ViewPagerAdapter(getParentFragmentManager());
//        viewPager.setAdapter(viewPagerAdapter);
//
//        // It is used to join TabLayout with ViewPager.
//        tabLayout.setupWithViewPager(viewPager);

        return view;
    }
}