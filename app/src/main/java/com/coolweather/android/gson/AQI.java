package com.coolweather.android.gson;

/**
 * Created by liuyang on 2017/11/26.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
