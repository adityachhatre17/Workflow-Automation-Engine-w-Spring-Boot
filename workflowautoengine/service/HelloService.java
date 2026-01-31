package com.kaizer.workflowautoengine.service;


import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public String getService(){
        return "this is from the Service";
    }
}
