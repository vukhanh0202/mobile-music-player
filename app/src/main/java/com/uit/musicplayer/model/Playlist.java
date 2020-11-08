package com.uit.musicplayer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Playlist {

    @SerializedName("idplaylist")
    @Expose
    private String idplaylist;
    @SerializedName("nameplaylist")
    @Expose
    private String nameplaylist;
    @SerializedName("imagebackground")
    @Expose
    private String imagebackground;
    @SerializedName("imageicon")
    @Expose
    private String imageicon;

    public String getIdplaylist() {
        return idplaylist;
    }

    public void setIdplaylist(String idplaylist) {
        this.idplaylist = idplaylist;
    }

    public String getNameplaylist() {
        return nameplaylist;
    }

    public void setNameplaylist(String nameplaylist) {
        this.nameplaylist = nameplaylist;
    }

    public String getImagebackground() {
        return imagebackground;
    }

    public void setImagebackground(String imagebackground) {
        this.imagebackground = imagebackground;
    }

    public String getImageicon() {
        return imageicon;
    }

    public void setImageicon(String imageicon) {
        this.imageicon = imageicon;
    }

}