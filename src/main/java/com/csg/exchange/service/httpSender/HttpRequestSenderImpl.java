package com.csg.exchange.service.httpSender;

import com.csg.exchange.service.httpSender.HttpRequestSender;
import com.csg.exchange.service.webserviceClient.AlertInfo;
import org.apache.http.HttpClientConnection;
import org.apache.http.client.HttpClient;
import org.apache.http.entity.StringEntity;
import org.jetbrains.annotations.Contract;
import net.sf.json.JSONObject;
import com.csg.exchange.service.webserviceClient.AlertInfo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;


public class HttpRequestSenderImpl implements HttpRequestSender{

    @Contract(pure = true)
    public  int sendGet(String url){
        return 0;
    }

    @Contract(pure = true)
    public  boolean sendPost(String url, JSONObject info){
        HttpPost httppost = new HttpPost(url);
        CloseableHttpClient httpclient = HttpClients.createDefault();
        CloseableHttpResponse response = null;
        try {
            StringEntity s = new StringEntity(info.toString());
            s.setContentEncoding("UTF-8");
            s.setContentType("application/json");//发送json数据需要设置contentType
            httppost.setEntity(s);
            response = httpclient.execute(httppost);
        } catch (IOException e) {
            e.printStackTrace();
        }
        HttpEntity entity = response.getEntity();
        String result = null;
        try {
            result = EntityUtils.toString(entity);
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
        if (result == null){
            return true;
        }
        return false;
    }


}
