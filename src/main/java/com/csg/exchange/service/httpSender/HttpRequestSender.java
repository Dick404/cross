package com.csg.exchange.service.httpSender;

import net.sf.json.JSONObject;

public interface HttpRequestSender {

    public int sendGet(String url);

    public boolean sendPost(String url, JSONObject info);


}
