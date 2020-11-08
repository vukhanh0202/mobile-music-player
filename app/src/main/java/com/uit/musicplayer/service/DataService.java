package com.uit.musicplayer.service;

import com.uit.musicplayer.model.Advertisement;
import com.uit.musicplayer.model.Category;
import com.uit.musicplayer.model.Playlist;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface DataService {

    @GET("SongBanner.php")
    Call<List<Advertisement>> getDataBanner();

    @GET("PlaylistRandom.php")
    Call<List<Playlist>> getPlayListForDay();

    @GET("CategoryRandom.php")
    Call<List<Category>> getCategoryForDay();
}
