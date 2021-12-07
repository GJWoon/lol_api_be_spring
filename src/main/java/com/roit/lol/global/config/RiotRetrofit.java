package com.roit.lol.global.config;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import okhttp3.OkHttpClient;
import retrofit2.converter.gson.GsonConverterFactory;

public class RiotRetrofit<T> {

    private String baseUrl = "https://kr.api.riotgames.com/";

    private T callObject;


    private Gson gson = new GsonBuilder().setLenient().create();

    private final OkHttpClient httpClient = OkHttpClients.getUnsafeOkHttpClient();


    private  retrofit2.Retrofit retrofit = new retrofit2.Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(httpClient)
            .build();
    public <T> T createService(Class<T> sClass) {
        return retrofit.create(sClass);
    }

}
