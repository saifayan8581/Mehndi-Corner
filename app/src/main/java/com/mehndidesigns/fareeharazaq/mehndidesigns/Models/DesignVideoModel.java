package com.mehndidesigns.fareeharazaq.mehndidesigns.Models;

/**
 * Created by Fareeha Razaq on 11/29/2017.
 */
public class DesignVideoModel {
    int image;
    String part_name;
    String like_counts; String btn_text;

    public DesignVideoModel(int image, String part_name, String like_counts, String btn_text) {
        this.image = image;
        this.part_name = part_name;
        this.like_counts = like_counts;
        this.btn_text = btn_text;
    }

    public void setBtn_text(String btn_text) {

        this.btn_text = btn_text;
    }

    public String getBtn_text() {

        return btn_text;
    }

    public int getImage() {
        return image;
    }

    public String getPart_name() {
        return part_name;
    }

    public String getLike_counts() {
        return like_counts;
    }

    public DesignVideoModel(int image, String part_name, String like_counts) {
        this.image = image;
        this.part_name = part_name;
        this.like_counts = like_counts;
    }

    public void setImage(int image) {

        this.image = image;
    }

    public void setPart_name(String part_name) {
        this.part_name = part_name;
    }

    public void setLike_counts(String like_counts) {
        this.like_counts = like_counts;
    }
}
