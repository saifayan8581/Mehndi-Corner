package com.mehndidesigns.fareeharazaq.mehndidesigns.Adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mehndidesigns.fareeharazaq.mehndidesigns.Activities.BodyPartDesigndetails;
import com.mehndidesigns.fareeharazaq.mehndidesigns.Models.HomeClassModel;
import com.mehndidesigns.fareeharazaq.mehndidesigns.R;

import java.util.ArrayList;

/**
 * Created by Fareeha Razaq on 11/28/2017.
 */
public class HomeClassAdapter extends RecyclerView.Adapter<HomeClassAdapter.MyViewHolder> {
    Activity mContext;
    ArrayList<HomeClassModel> albumList;
    LayoutInflater inflator;
    @Override
    public HomeClassAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflator.inflate(R.layout.homecard, parent, false);
        return new MyViewHolder(v);
    }
    public HomeClassAdapter(Activity mContext, ArrayList<HomeClassModel> albumList) {
        this.mContext = mContext;
        this.albumList = albumList;
        this.inflator = mContext.getLayoutInflater();
    }
    @Override
    public void onBindViewHolder(HomeClassAdapter.MyViewHolder holder, int position) {
        HomeClassModel model = albumList.get(position);
        holder.design_partName.setText(model.getPart_name());
        holder.image.setImageResource(model.getImage());
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it= new Intent(view.getContext(), BodyPartDesigndetails.class);
                view.getContext().startActivity(it);
                Toast.makeText(mContext,"you clicked",Toast.LENGTH_LONG).show();
            }
        });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"you clicked",Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }
    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView image;
        TextView design_partName;
        public MyViewHolder(View itemView) {
            super(itemView);
            image= (ImageView) itemView.findViewById(R.id.background_image);
            design_partName=(TextView) itemView.findViewById(R.id.part_name);
        }
    }
}
