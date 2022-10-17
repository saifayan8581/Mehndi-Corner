package com.mehndidesigns.fareeharazaq.mehndidesigns.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mehndidesigns.fareeharazaq.mehndidesigns.Adapters.VideoDesignListAdapter;
import com.mehndidesigns.fareeharazaq.mehndidesigns.Models.DesignVideoModel;
import com.mehndidesigns.fareeharazaq.mehndidesigns.R;

import java.util.ArrayList;

/**
 * Created by Fareeha Razaq on 11/29/2017.
 */
public class VideosFragment extends Fragment {
    ArrayList<DesignVideoModel> list;

    VideoDesignListAdapter designVideoAdapter;
    RecyclerView recyclerView;
    DesignVideoModel designVideoModel;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.videos_fragment, null);
        recyclerView = (RecyclerView) v.findViewById(R.id.recycler_view);
        list = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            designVideoModel = new DesignVideoModel(R.drawable.mehndi, "7 million Views", "700K", "Unfollow");
            list.add(designVideoModel);
            designVideoModel = new DesignVideoModel(R.drawable.design2, "Arabic Design", "676", "Follow Me");
            list.add(designVideoModel);


        }
        designVideoAdapter = new VideoDesignListAdapter(getActivity(), list);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getActivity(), 1);

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(designVideoAdapter);
        return v;
    }
}
