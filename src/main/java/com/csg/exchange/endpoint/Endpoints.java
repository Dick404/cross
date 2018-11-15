package com.csg.exchange.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import com.csg.exchange.repository.Repositories;
import com.csg.exchange.service.webserviceClient.AlertInfo;
import com.csg.exchange.service.webserviceClient.PushAlertInfoResponse;
import com.csg.exchange.service.webserviceClient.PushAlertInfoRequest;


@Endpoint
public class Endpoints {
    private static final String NAMESPACE_URI = "http://spring.io/guides/gs-producing-web-service";

       private Repositories Repositories;

    @Autowired
    public Endpoints(Repositories Repositories) {
        this.Repositories = Repositories;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "pushAlertInfoRequest")
    @ResponsePayload
    public PushAlertInfoResponse pushAlertInfo(@RequestPayload PushAlertInfoRequest request) {
        PushAlertInfoResponse response = new PushAlertInfoResponse();
        AlertInfo info = new AlertInfo();
        try{
            AlertInfo alertInfo = request.getName();
            //System.out.println(alertInfo);
            response.setResult(Repositories.sendData(alertInfo));

        }catch (Exception ex){
            System.out.print(ex);
        }

        return response;
    }
}
