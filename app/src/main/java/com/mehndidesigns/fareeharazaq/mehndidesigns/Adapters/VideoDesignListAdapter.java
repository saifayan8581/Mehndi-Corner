package com.mehndidesigns.fareeharazaq.mehndidesigns.Adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.mehndidesigns.fareeharazaq.mehndidesigns.Models.DesignVideoModel;
import com.mehndidesigns.fareeharazaq.mehndidesigns.R;

import java.util.ArrayList;

/**
 * Created by Fareeha Razaq on 11/29/2017.
 */
public class VideoDesignListAdapter extends RecyclerView.Adapter<VideoDesignListAdapter.MyViewHolder> {
    Activity mContext; static boolean clicked= false;
    LayoutInflater inflater;
    private ArrayList<DesignVideoModel> items;

    public VideoDesignListAdapter(Activity mContext, ArrayList<DesignVideoModel> items) {
        this.mContext = mContext;
        inflater = LayoutInflater.from(this.mContext);
        this.items = items;
    }

    @Override
    public VideoDesignListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = inflater.inflate(R.layout.design_video_listcard, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(final VideoDesignListAdapter.MyViewHolder holder, int position) {
        DesignVideoModel model= items.get(position);
        holder.title.setText(model.getPart_name());
        holder.like_counts.setText(model.getLike_counts());
        holder.image.setImageResource(model.getImage());
        holder.followme_btn.setText(model.getBtn_text());
        holder.followme_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"Follow",Toast.LENGTH_LONG).show();
            }
        });
        holder.videoplay_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"play video",Toast.LENGTH_LONG).show();
                if(!clicked) {
                    clicked = false;
                }
                else {
                    clicked= true;
                }
            }
        });

    }


    @Override
    public int getItemCount() {
        return items.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        Button followme_btn;
            TextView title;
            ImageView image;ImageView videoplay_btn; TextView like_counts;

            public MyViewHolder(View itemView) {
                super(itemView);
                followme_btn= (Button) itemView.findViewById(R.id. follow_me);
                title = (TextView) itemView.findViewById(R.id.video_tag);
                videoplay_btn= (ImageView) itemView.findViewById(R.id.video_play_btn);
                image = (ImageView) itemView.findViewById(R.id.design_photo);
                like_counts=(TextView) itemView.findViewById(R.id.count_likes);
        }
    }
}
