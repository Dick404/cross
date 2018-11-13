package com.csg.exchange.repository;

import com.csg.exchange.service.httpSender.HttpRequestSenderImpl;
import com.csg.exchange.service.httpSender.HttpRequestSender;
import net.sf.json.JSONObject;
import com.csg.exchange.service.webserviceClient.AlertInfo;

import org.springframework.stereotype.Component;

@Component
public class Repositories {

    private int result;

    public int sendData(AlertInfo info) {
        HttpRequestSender httpClient = new HttpRequestSenderImpl();
        if (httpClient.sendPost("http://172.16.1.75:3375/sms",Repositories.initData(info))){
            return 1;
        }
        return 0;
    }

    public static JSONObject initData(AlertInfo info){
        JSONObject json = JSONObject.fromObject(info);
        json.put("iPAddress", json.get("IPAddress"));
        return json;
    }

    public int check(AlertInfo info){
        if (info.equals(info)){
            return 1;
        }
        else{
            return 0;
        }
    }
}
