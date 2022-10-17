package com.mehndidesigns.fareeharazaq.mehndidesigns.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mehndidesigns.fareeharazaq.mehndidesigns.Adapters.DesignImageAdapter;
import com.mehndidesigns.fareeharazaq.mehndidesigns.Adapters.SavedDesignsAdapter;
import com.mehndidesigns.fareeharazaq.mehndidesigns.Models.DesignImageModel;
import com.mehndidesigns.fareeharazaq.mehndidesigns.R;

import java.util.ArrayList;

/**
 * Created by Fareeha Razaq on 11/29/2017.
 */
public class SavedDesigns extends Fragment {
    ArrayList<DesignImageModel> list;

    SavedDesignsAdapter designImageAdapter;
    RecyclerView recyclerView;
    DesignImageModel designImageModel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.images_fragment, null);
        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);
        list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            designImageModel = new DesignImageModel(R.drawable.mehndi, "Ltest Design");
            list.add(designImageModel);
            designImageModel = new DesignImageModel(R.drawable.design2, "Arabic Design");
            list.add(designImageModel);
        }
        designImageAdapter = new SavedDesignsAdapter(getActivity(), list);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 1);

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(designImageAdapter);
        return v;
    }
}
