package com.phamhongthai_t1902e_weather.network;

import com.phamhongthai_t1902e_weather.model.Weather;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiManager {
    public static String URL = "http://dataservice.accuweather.com";

    @GET("/forecasts/v1/hourly/12hour/353412?apikey=5XWPrxHLas8Ygv3bzf4oWetHNheF7mZN&language=vi-vn&metric=true")
    Call<List<Weather>> getHour();
}
