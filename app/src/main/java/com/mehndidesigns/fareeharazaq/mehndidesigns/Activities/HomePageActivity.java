package com.mehndidesigns.fareeharazaq.mehndidesigns.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mehndidesigns.fareeharazaq.mehndidesigns.Adapters.HomeClassAdapter;
import com.mehndidesigns.fareeharazaq.mehndidesigns.Models.HomeClassModel;
import com.mehndidesigns.fareeharazaq.mehndidesigns.R;

import java.util.ArrayList;

public class HomePageActivity extends Fragment {
    RecyclerView recyclerView1;
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View v = inflater.inflate(R.layout.home_page_activity,null);

        recyclerView1= (RecyclerView)v.findViewById(R.id.recycler_view);

        ArrayList<HomeClassModel> arrayList= new ArrayList<>();
        HomeClassModel model= new HomeClassModel(R.drawable.drawer_header,"Hand designs");
        for(int i=0;i<5;i++){
            arrayList.add(model);
        }
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(),1);
        recyclerView1.setLayoutManager(mLayoutManager);
        recyclerView1.setItemAnimator(new DefaultItemAnimator());
        HomeClassAdapter homeClassAdapter= new HomeClassAdapter(getActivity(),arrayList);
        recyclerView1.setAdapter(homeClassAdapter);
        return v;
    }
}
