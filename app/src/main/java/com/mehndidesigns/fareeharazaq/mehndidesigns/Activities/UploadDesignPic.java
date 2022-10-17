package com.mehndidesigns.fareeharazaq.mehndidesigns.Activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mehndidesigns.fareeharazaq.mehndidesigns.R;

/**
 * Created by Fareeha Razaq on 11/30/2017.
 */
public class UploadDesignPic extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.upload_design_pic,null);
        return v;
    }
}
