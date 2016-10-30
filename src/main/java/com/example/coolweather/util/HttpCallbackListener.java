package com.example.coolweather.util;

/**
 * Created by fountian on 2016/10/30.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
