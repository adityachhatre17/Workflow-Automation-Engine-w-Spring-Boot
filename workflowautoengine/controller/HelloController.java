package com.kaizer.workflowautoengine.controller;


import com.kaizer.workflowautoengine.service.AgeService;
import com.kaizer.workflowautoengine.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class HelloController {

    @GetMapping("/hello")
    public String greetings(){
        return "Hello! You are starting this project :)";
    }

    @Autowired
    private HelloService helloService;
    @Autowired
    private AgeService ageService;

  /*  public HelloController(HelloService helloService){
        this.helloService = helloService;
    }*/

    public HelloController(AgeService ageService){
        this.ageService = ageService;
    }

    @GetMapping("/serv")
    public String hello(){
        return helloService.getService();
    }

    @GetMapping("/{age}")
    public String check(@PathVariable int age){
        return ageService.checkAge(age);
    }



}
