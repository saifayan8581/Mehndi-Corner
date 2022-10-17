package com.mehndidesigns.fareeharazaq.mehndidesigns.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mehndidesigns.fareeharazaq.mehndidesigns.FragmentPagerApaters.FragmentAdapter;
import com.mehndidesigns.fareeharazaq.mehndidesigns.Fragments.ImagesFragment;
import com.mehndidesigns.fareeharazaq.mehndidesigns.Fragments.VideosFragment;
import com.mehndidesigns.fareeharazaq.mehndidesigns.R;

/**
 * Created by Fareeha Razaq on 11/29/2017.
 */
public class PopularPostsFragment extends Fragment {

    TabLayout tabLayout;
    ViewPager viewpager;
    public static FragmentAdapter adapter;

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View v = inflater.inflate(R.layout.popularposts_fragment, null);

        viewpager = (ViewPager) v.findViewById(R.id.ViewPager);
        tabLayout = (TabLayout) v.findViewById(R.id.tablayout);
        adapter = new FragmentAdapter(getChildFragmentManager());
        ImagesFragment imagesFragment = new ImagesFragment();
        VideosFragment videosFragment = new VideosFragment();
        adapter.addFragment(imagesFragment);
        adapter.addFragment(videosFragment);
        viewpager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewpager);

        tabLayout.getTabAt(0).setText("Popular Images");
        tabLayout.getTabAt(1).setText("Popular Videos");
        return v;
    }
}
