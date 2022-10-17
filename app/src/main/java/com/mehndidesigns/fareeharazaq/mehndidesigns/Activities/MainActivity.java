package com.mehndidesigns.fareeharazaq.mehndidesigns.Activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.mehndidesigns.fareeharazaq.mehndidesigns.R;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    Toolbar toolbar;
    NavigationView nav;
    FrameLayout frm;
    DrawerLayout dw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Mehndi Designs");
        nav=(NavigationView) findViewById(R.id.nav_view);
        dw = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, dw, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        dw.setDrawerListener(toggle);
        toggle.syncState();
        nav.setCheckedItem(R.id.homeAc);
        Fragment fragment;
        fragment = new HomePageActivity();
        FragmentManager fm= getSupportFragmentManager();
        fm.beginTransaction().replace(R.id.flContent,fragment).commit();
        nav.setNavigationItemSelectedListener(this);// we are changing there

    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Toast.makeText(MainActivity.this,"Settings",Toast.LENGTH_LONG).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment fragment= null;
        Log.e(" we are switching","switching");
        switch (id) {
            case R.id.homeAc:
                fragment = new HomePageActivity();
                Log.e("I m true"," True here");
                break;
            case R.id.popular_posts:
                nav.getMenu().findItem(R.id.homeAc).setChecked(false);
                fragment = new PopularPostsFragment();
                getSupportActionBar().setTitle("Popular posts");
                Log.e("I m true"," True here");
                break;
            case R.id.winning_posts:
                nav.getMenu().findItem(R.id.homeAc).setChecked(false);
                fragment = new WinningPostsFragment();
                getSupportActionBar().setTitle("Winning posts");
                Log.e("I m true"," True here");
                break;
            case R.id.saved_posts:
                nav.getMenu().findItem(R.id.homeAc).setChecked(false);
                fragment = new SavedDesigns();
                getSupportActionBar().setTitle("Saved posts");
                Log.e("I m true"," True here");
                break;
            case R.id.other_posts:
                nav.getMenu().findItem(R.id.homeAc).setChecked(false);
                fragment = new OtherPostsFragment();
                getSupportActionBar().setTitle("Other posts");
                Log.e("I m true"," True here");
                break;
            case R.id.upload_video:
                nav.getMenu().findItem(R.id.homeAc).setChecked(false);
                fragment = new UploadDesignVideo();
                getSupportActionBar().setTitle("Upload Video");
                Log.e("I m true"," True here");
                break;
            case R.id.upload_image:
                nav.getMenu().findItem(R.id.homeAc).setChecked(false);
                fragment = new UploadDesignPic();
                getSupportActionBar().setTitle("Popular posts");
                Log.e("I m true"," True here");
                break;
        }

            FragmentManager fm= getSupportFragmentManager();
            fm.beginTransaction().replace(R.id.flContent,fragment).commit();
        dw.closeDrawer(GravityCompat.START);

        nav.getMenu().findItem(id).setChecked(true);
        return true;
    }

}
