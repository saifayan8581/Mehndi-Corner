package com.mehndidesigns.fareeharazaq.mehndidesigns.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.mehndidesigns.fareeharazaq.mehndidesigns.FragmentPagerApaters.FragmentAdapter;
import com.mehndidesigns.fareeharazaq.mehndidesigns.Fragments.ImagesFragment;
import com.mehndidesigns.fareeharazaq.mehndidesigns.Fragments.VideosFragment;
import com.mehndidesigns.fareeharazaq.mehndidesigns.R;

public class MoreCatagorized extends AppCompatActivity {
    Toolbar toolbar;
    TabLayout tabLayout;
    ViewPager viewpager;
    public static FragmentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more_catagorized);

        toolbar= (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        Intent it= getIntent();
        String toolbar_text= it.getStringExtra("Mehndi Designs");
        toolbar.setTitle(toolbar_text);

        tabLayout=(TabLayout) findViewById(R.id.tablayout);
        viewpager= (ViewPager) findViewById(R.id.ViewPager);
        adapter= new FragmentAdapter(getSupportFragmentManager());

        ImagesFragment imagesFragment= new ImagesFragment();
        VideosFragment videosFragment= new VideosFragment();
        adapter.addFragment(imagesFragment);
        adapter.addFragment(videosFragment);
        viewpager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewpager);

        tabLayout.getTabAt(0).setText("Images");
        tabLayout.getTabAt(1).setText("Videos");

    }
}
