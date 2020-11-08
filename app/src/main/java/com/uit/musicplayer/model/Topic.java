package com.uit.musicplayer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Topic {

    @SerializedName("idtopic")
    @Expose
    private String idtopic;
    @SerializedName("nametopic")
    @Expose
    private String nametopic;
    @SerializedName("imagetopic")
    @Expose
    private String imagetopic;

    public String getIdtopic() {
        return idtopic;
    }

    public void setIdtopic(String idtopic) {
        this.idtopic = idtopic;
    }

    public String getNametopic() {
        return nametopic;
    }

    public void setNametopic(String nametopic) {
        this.nametopic = nametopic;
    }

    public String getImagetopic() {
        return imagetopic;
    }

    public void setImagetopic(String imagetopic) {
        this.imagetopic = imagetopic;
    }

}
