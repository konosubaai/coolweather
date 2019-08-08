package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;//定义了单日天气的实体类，此处声明实体类引用的时候使用集合类型来进行声明(这里使用List集合来引用Forecast类)
}
