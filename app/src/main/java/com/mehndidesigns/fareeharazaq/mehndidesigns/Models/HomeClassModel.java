package com.mehndidesigns.fareeharazaq.mehndidesigns.Models;

/**
 * Created by Fareeha Razaq on 11/28/2017.
 */
public class HomeClassModel {
    int image;
    String part_name;
    public HomeClassModel() {
    }

    public HomeClassModel(int image, String part_name) {

        this.image = image;
        this.part_name = part_name;
    }

    public void setImage(int image) {

        this.image = image;
    }

    public void setPart_name(String part_name) {
        this.part_name = part_name;
    }

    public String getPart_name() {

        return part_name;
    }

    public int getImage() {
        return image;
    }


}
