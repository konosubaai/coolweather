package com.coolweather.android.util;


import okhttp3.OkHttpClient;
import okhttp3.Request;

//数据从服务器获取，这里和服务器的交互必不可少
public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}


//由于OkHttp出色的封装，这里和服务器进行交互的代码非常简单，现在我们发起一条HTTP请求只需要调用sendOkHttpRequest（），传入请求地址
//并注册一个回调来处理服务器响应就可以了
