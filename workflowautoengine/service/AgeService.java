package com.kaizer.workflowautoengine.service;

import org.springframework.stereotype.Service;

@Service
public class AgeService {

    public String checkAge(int age){
        return age>=18 ? "Adult" : "Minor";
    }
}
