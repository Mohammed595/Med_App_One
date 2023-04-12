package com.example.med_app_one;

import java.io.Serializable;

public class PostTaskToList implements Serializable {

    private String title ;
    private  String discrption ;

    public PostTaskToList  () {}

    public PostTaskToList(String title, String discrption) {
        this.title = title;
        this.discrption = discrption;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDiscrption() {
        return discrption;
    }

    public void setDiscrption(String discrption) {
        this.discrption = discrption;
    }
}
