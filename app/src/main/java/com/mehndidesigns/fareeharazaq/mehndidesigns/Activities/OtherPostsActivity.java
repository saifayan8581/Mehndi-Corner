package com.mehndidesigns.fareeharazaq.mehndidesigns.Activities;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.mehndidesigns.fareeharazaq.mehndidesigns.FragmentPagerApaters.FragmentAdapter;
import com.mehndidesigns.fareeharazaq.mehndidesigns.Fragments.ImagesFragment;
import com.mehndidesigns.fareeharazaq.mehndidesigns.Fragments.SingleImageFragment;
import com.mehndidesigns.fareeharazaq.mehndidesigns.Fragments.VideosFragment;
import com.mehndidesigns.fareeharazaq.mehndidesigns.R;

public class OtherPostsActivity extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewpager;
    public static FragmentAdapter adapter;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_posts);

        Intent it= getIntent();
        toolbar= (Toolbar)findViewById(R.id.toolbar);
        String post_type= it.getStringExtra("post_tpe");
        toolbar.setTitle(post_type);
        viewpager = (ViewPager)findViewById(R.id.ViewPager);
        tabLayout = (TabLayout) findViewById(R.id.tablayout);
        adapter = new FragmentAdapter(getSupportFragmentManager());
        SingleImageFragment imagesFragment = new SingleImageFragment();
        VideosFragment videosFragment = new VideosFragment();
        adapter.addFragment(imagesFragment);
        adapter.addFragment(videosFragment);
        viewpager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewpager);

        tabLayout.getTabAt(0).setText("Design Images");
        tabLayout.getTabAt(1).setText("Design Videos");

    }
}
