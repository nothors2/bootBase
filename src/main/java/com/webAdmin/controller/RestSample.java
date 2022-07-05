package com.webAdmin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Leo.
 * User: notho
 * Date: 2022-06-07, Time: 오후 5:16
 */
@RestController
public class RestSample {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/info")
    public Map<String,Object> info(){
        double dValue = Math.random() ;
        int sec = (int) (500 * dValue);
        logger.error("RestSample Log sec : "+sec);
        Map<String,Object> map = new HashMap<>();
        map.put("test","test2");
        map.put("dValue",""+sec);
        try {
            Thread.sleep(sec);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return map;
    }    @RequestMapping("/")
    public Map<String,Object> home(){
        double dValue = Math.random() ;
        int sec = (int) (500 * dValue);
        logger.error("RestSample Log sec : "+sec);
        Map<String,Object> map = new HashMap<>();
        map.put("home","testtesttesttesttest");
        map.put("dValue",""+sec);
        try {
            Thread.sleep(sec);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return map;
    }
}
