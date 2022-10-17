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

import com.mehndidesigns.fareeharazaq.mehndidesigns.Activities.MoreCatagorized;
import com.mehndidesigns.fareeharazaq.mehndidesigns.Models.CatagorisedDesignModel;
import com.mehndidesigns.fareeharazaq.mehndidesigns.R;

import java.util.ArrayList;

/**
 * Created by Fareeha Razaq on 11/28/2017.
 */
public class DesignByCatagoryAdapter extends RecyclerView.Adapter<DesignByCatagoryAdapter.MyViewHolder> {
    Activity mContext;
    LayoutInflater inflater;
    private ArrayList<CatagorisedDesignModel> items;
    public DesignByCatagoryAdapter(Activity context, ArrayList myList) {
        this.items = myList;
        this.mContext = context;
        inflater = LayoutInflater.from(this.mContext);
    }

    @Override
    public DesignByCatagoryAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.catagoriseddesign_listcard, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        CatagorisedDesignModel model= items.get(position);

        holder.title.setText(model.getPart_name());

        holder.image.setImageResource(model.getImage());
        holder.image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it= new Intent(v.getContext(),MoreCatagorized.class);

                it.putExtra("Mehndi Designs","Mehndi Designs");
                v.getContext().startActivity(it);
                Toast.makeText(mContext,"you clicked",Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        TextView title;
        ImageView image;

        public MyViewHolder(View itemView) {
            super(itemView);
            title = (TextView) itemView.findViewById(R.id.textview);
            image = (ImageView) itemView.findViewById(R.id.background_image);
        }
    }
}
