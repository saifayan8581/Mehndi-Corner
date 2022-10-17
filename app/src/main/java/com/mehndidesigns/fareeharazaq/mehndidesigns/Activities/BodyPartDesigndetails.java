package com.mehndidesigns.fareeharazaq.mehndidesigns.Activities;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;

import com.mehndidesigns.fareeharazaq.mehndidesigns.Adapters.DesignByCatagoryAdapter;
import com.mehndidesigns.fareeharazaq.mehndidesigns.Adapters.DesignImageAdapter;
import com.mehndidesigns.fareeharazaq.mehndidesigns.Adapters.VideoDesignListAdapter;
import com.mehndidesigns.fareeharazaq.mehndidesigns.Models.CatagorisedDesignModel;
import com.mehndidesigns.fareeharazaq.mehndidesigns.Models.DesignImageModel;
import com.mehndidesigns.fareeharazaq.mehndidesigns.Models.DesignVideoModel;
import com.mehndidesigns.fareeharazaq.mehndidesigns.R;

import java.util.ArrayList;

/**
 * Created by Fareeha Razaq on 11/28/2017.
 */
public class BodyPartDesigndetails extends Activity {
    DesignByCatagoryAdapter designByRegionsAdapter;
   VideoDesignListAdapter videoDesignListAdapter;
    RecyclerView region_design_list; ArrayList<DesignImageModel> imagesList;
    RecyclerView designImageList;
    RecyclerView designVideoList;
//    RecyclerView bodypart_design_list;
    RecyclerView eventsdesign_list; Toolbar toolbar;
    RecyclerView authordesign_list;
    ArrayList<CatagorisedDesignModel> arrayList; ArrayList<DesignVideoModel> designVideoItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.body_partdesign_details);

        toolbar= (Toolbar)findViewById(R.id.toolbar);
        toolbar.setTitle("Latest Designs");
//        bodypart_design_list=(RecyclerView) findViewById(R.id.bodypartdesign_list);
        eventsdesign_list=(RecyclerView) findViewById(R.id.eventsdesign_list);
        authordesign_list=(RecyclerView) findViewById(R.id.authordesigns_list);
        region_design_list=(RecyclerView) findViewById(R.id.regiondesigns_list);
        designImageList=(RecyclerView) findViewById(R.id.design_photos);
        designVideoList= (RecyclerView) findViewById(R.id.design_videos);
        arrayList= new ArrayList<>();
        designVideoItems= new ArrayList<>();
        imagesList= new ArrayList<>();

        CatagorisedDesignModel model= new CatagorisedDesignModel(R.drawable.mhndidesign,"Hand design");
        for(int i=0;i<4;i++){
            model= new CatagorisedDesignModel(R.drawable.mhndidesign,"Hand design");
            arrayList.add(model);
            model= new CatagorisedDesignModel(R.drawable.design2,"Hand design");
            arrayList.add(model);
            model= new CatagorisedDesignModel(R.drawable.design3,"Hand design");
            arrayList.add(model);
        }
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(BodyPartDesigndetails.this, LinearLayoutManager.HORIZONTAL,false  );
        eventsdesign_list.setLayoutManager(mLayoutManager);
        eventsdesign_list.setItemAnimator(new DefaultItemAnimator());
//        bodypart_design_list.setLayoutManager(mLayoutManager);
//        bodypart_design_list.setItemAnimator(new DefaultItemAnimator());

        RecyclerView.LayoutManager LayoutManager = new LinearLayoutManager(BodyPartDesigndetails.this, LinearLayoutManager.HORIZONTAL,false  );
        region_design_list.setLayoutManager(LayoutManager);
        region_design_list.setItemAnimator(new DefaultItemAnimator());
        designByRegionsAdapter= new DesignByCatagoryAdapter(BodyPartDesigndetails.this,arrayList);
//        bodypart_design_list.setAdapter(designByRegionsAdapter);
        region_design_list.setAdapter(designByRegionsAdapter);
        eventsdesign_list.setAdapter(designByRegionsAdapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(BodyPartDesigndetails.this, LinearLayoutManager.HORIZONTAL,false  );
        authordesign_list.setLayoutManager(layoutManager);
        authordesign_list.setItemAnimator(new DefaultItemAnimator());
        authordesign_list.setAdapter(designByRegionsAdapter);
//        authordesign_list.setNestedScrollingEnabled(false);

        for(int i=0;i<10;i++){
            DesignImageModel imageModel= new DesignImageModel(R.drawable.design2,"Most Liked","305");
            imagesList.add(imageModel);
            DesignVideoModel designVideoModel= new DesignVideoModel(R.drawable.design3,"Mehndi Vide","788","Follow Me");
            designVideoItems.add(designVideoModel);
        }
        DesignImageModel imageModel= new DesignImageModel(R.drawable.design2,"Most Liked","305");
       DesignImageAdapter designImageAdapter= new DesignImageAdapter(BodyPartDesigndetails.this,imagesList);
        RecyclerView.LayoutManager layoutmanager = new GridLayoutManager(BodyPartDesigndetails.this,1);

        designImageList.setLayoutManager(layoutmanager);
        designImageList.setItemAnimator(new DefaultItemAnimator());
        designImageList.setAdapter(designImageAdapter);
//        designImageList.setNestedScrollingEnabled(false);

        RecyclerView.LayoutManager manager = new GridLayoutManager(BodyPartDesigndetails.this,1);
        videoDesignListAdapter= new VideoDesignListAdapter(BodyPartDesigndetails.this,designVideoItems);
        designVideoList.setLayoutManager(manager);
        designVideoList.setItemAnimator(new DefaultItemAnimator());
        designVideoList.setAdapter(videoDesignListAdapter);
    }
}
