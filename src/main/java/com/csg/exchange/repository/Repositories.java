package com.csg.exchange.repository;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

import com.csg.exchange.service.webserviceClient.AlertInfo;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

@Component
public class Repositories {

    private int result;

    @PostConstruct
    public void initData() {

    }

    public int check(AlertInfo info){
        if (info.equals("check")){
            return 1;
        }
        else{
            return 0;
        }
    }
}
