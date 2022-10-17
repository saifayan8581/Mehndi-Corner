package com.mehndidesigns.fareeharazaq.mehndidesigns.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mehndidesigns.fareeharazaq.mehndidesigns.Adapters.DesignImageAdapter;
import com.mehndidesigns.fareeharazaq.mehndidesigns.Models.DesignImageModel;
import com.mehndidesigns.fareeharazaq.mehndidesigns.R;

import java.util.ArrayList;

/**
 * Created by Fareeha Razaq on 11/30/2017.
 */
public class SingleImageFragment extends Fragment {
    ArrayList<DesignImageModel> list;

    DesignImageAdapter designImageAdapter;
    RecyclerView recyclerView;
    DesignImageModel designImageModel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.images_fragment, null);
        Log.e("on cretaeview", "Oncreate view catagory");
        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);
        list = new ArrayList<>();

        for(int i=0;i<3;i++){
            designImageModel= new DesignImageModel(R.drawable.mehndi,"7 million Views","700K");
            list.add(designImageModel);
            designImageModel= new DesignImageModel(R.drawable.design2,"Arabic Design","676");
            list.add(designImageModel);
        }
        designImageAdapter= new DesignImageAdapter(getActivity(),list);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(),1);

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(designImageAdapter);
        return v;
    }
}
