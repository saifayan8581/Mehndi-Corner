package com.mehndidesigns.fareeharazaq.mehndidesigns.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.mehndidesigns.fareeharazaq.mehndidesigns.R;

/**
 * Created by Fareeha Razaq on 11/29/2017.
 */
public class OtherPostsFragment extends Fragment {
    ImageView contestImage; ImageView featuredImage;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.otherposts_fragment, null);

        contestImage= (ImageView) v.findViewById(R.id.contest_posts);
        featuredImage= (ImageView) v.findViewById(R.id.featured_posts);

        featuredImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it= new Intent(v.getContext(),OtherPostsActivity.class);
                it.putExtra("post_tpe","Featured Posts");
                v.getContext().startActivity(it);
            }
        });
        contestImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it= new Intent(v.getContext(),OtherPostsActivity.class);
                it.putExtra("post_tpe","Contest Posts");
                v.getContext().startActivity(it);
            }
        });
        return v;
    }
}
