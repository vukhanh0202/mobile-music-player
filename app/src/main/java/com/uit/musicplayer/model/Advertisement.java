package com.uit.musicplayer.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Advertisement {

    @SerializedName("idAdvertisement")
    @Expose
    private String idAdvertisement;
    @SerializedName("imageadvertisement")
    @Expose
    private String imageadvertisement;
    @SerializedName("contentadvertisement")
    @Expose
    private String contentadvertisement;
    @SerializedName("idSong")
    @Expose
    private String idSong;
    @SerializedName("nameSong")
    @Expose
    private String nameSong;
    @SerializedName("imageSong")
    @Expose
    private String imageSong;

    public String getIdAdvertisement() {
        return idAdvertisement;
    }

    public void setIdAdvertisement(String idAdvertisement) {
        this.idAdvertisement = idAdvertisement;
    }

    public String getImageadvertisement() {
        return imageadvertisement;
    }

    public void setImageadvertisement(String imageadvertisement) {
        this.imageadvertisement = imageadvertisement;
    }

    public String getContentadvertisement() {
        return contentadvertisement;
    }

    public void setContentadvertisement(String contentadvertisement) {
        this.contentadvertisement = contentadvertisement;
    }

    public String getIdSong() {
        return idSong;
    }

    public void setIdSong(String idSong) {
        this.idSong = idSong;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getImageSong() {
        return imageSong;
    }

    public void setImageSong(String imageSong) {
        this.imageSong = imageSong;
    }

}