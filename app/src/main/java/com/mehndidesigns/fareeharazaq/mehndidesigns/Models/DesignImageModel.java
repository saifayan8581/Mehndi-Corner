package com.mehndidesigns.fareeharazaq.mehndidesigns.Models;

/**
 * Created by Fareeha Razaq on 11/28/2017.
 */
public class DesignImageModel {
    int image;
    String part_name;
    String like_counts;

    public DesignImageModel(int image, String part_name) {
        this.image = image;
        this.part_name = part_name;
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

    public DesignImageModel(int image, String part_name, String like_counts) {
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
