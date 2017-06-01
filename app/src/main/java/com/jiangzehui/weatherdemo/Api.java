package com.jiangzehui.weatherdemo;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by jiangzehui on 17/5/31.
 */
public interface Api {
    @GET("v1/weather/citys?key=1e501124818b4")
    Call<CityModel> getData();



    @GET("v1/weather/query?key=1e501124818b4")
    Call<WeatherModel> getData(@Query("province") String province,@Query("city") String city);


}
