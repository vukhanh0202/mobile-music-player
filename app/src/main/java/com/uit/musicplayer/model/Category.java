package com.uit.musicplayer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Category {

    @SerializedName("idcategory")
    @Expose
    private String idcategory;
    @SerializedName("namecategory")
    @Expose
    private String namecategory;
    @SerializedName("imagecategory")
    @Expose
    private String imagecategory;
    @SerializedName("topic")
    @Expose
    private Topic topic;

    public String getIdcategory() {
        return idcategory;
    }

    public void setIdcategory(String idcategory) {
        this.idcategory = idcategory;
    }

    public String getNamecategory() {
        return namecategory;
    }

    public void setNamecategory(String namecategory) {
        this.namecategory = namecategory;
    }

    public String getImagecategory() {
        return imagecategory;
    }

    public void setImagecategory(String imagecategory) {
        this.imagecategory = imagecategory;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }

}