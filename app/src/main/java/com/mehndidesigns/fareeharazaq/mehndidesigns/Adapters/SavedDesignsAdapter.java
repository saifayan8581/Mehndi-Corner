package com.mehndidesigns.fareeharazaq.mehndidesigns.Adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mehndidesigns.fareeharazaq.mehndidesigns.Models.DesignImageModel;
import com.mehndidesigns.fareeharazaq.mehndidesigns.R;

import java.util.ArrayList;

/**
 * Created by Fareeha Razaq on 11/29/2017.
 */
public class SavedDesignsAdapter extends RecyclerView.Adapter<SavedDesignsAdapter.MyViewHolder>{
    Activity mContext;
    LayoutInflater inflater;
    private ArrayList<DesignImageModel> items;
    @Override
    public SavedDesignsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.saveddesignscard, parent, false);
        return new MyViewHolder(v);
    }
    public SavedDesignsAdapter(Activity mContext, ArrayList<DesignImageModel> items) {
        this.mContext = mContext;
        inflater = LayoutInflater.from(this.mContext);
        this.items = items;
    }
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        DesignImageModel model= items.get(position);
//        holder.imagetitile.setText(model.getPart_name());
        holder.image.setImageResource(model.getImage());
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"you clicked",Toast.LENGTH_LONG).show();
            }
        });
    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView imagetitile;
        ImageView image;
        public MyViewHolder(View itemView) {
            super(itemView);
            imagetitile = (TextView) itemView.findViewById(R.id.design_tag);
            image = (ImageView) itemView.findViewById(R.id.design_photo);
        }
    }
}
