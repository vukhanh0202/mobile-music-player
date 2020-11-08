package com.uit.musicplayer.service;

public class APIService {

    private static String base_url = "https://vukhanh0202.000webhostapp.com/Server/";

    public static DataService getService(){
        return APIRetrofitClient.getClient(base_url).create(DataService.class);
    }
}
