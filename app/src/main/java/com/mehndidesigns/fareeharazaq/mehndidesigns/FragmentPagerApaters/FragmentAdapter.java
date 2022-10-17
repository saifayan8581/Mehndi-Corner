package com.mehndidesigns.fareeharazaq.mehndidesigns.FragmentPagerApaters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by Fareeha Razaq on 11/29/2017.
 */
public class FragmentAdapter extends FragmentPagerAdapter {
    ArrayList<Fragment> fragmentArray= new ArrayList<>();
    ArrayList<Integer> iconAdapter= new ArrayList<>();

    public FragmentAdapter(android.support.v4.app.FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentArray.get(position);
    }

    @Override
    public int getCount() {
        return fragmentArray.size();
    }
    public  void addFragment(Fragment fragment){
        fragmentArray.add(fragment);
    }
}
