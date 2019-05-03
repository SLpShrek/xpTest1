package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    public String aaa;


    @GetMapping("hello")
    public String hello(){
        return "hello";
    }

    public void aaa(){
        System.out.println(aaa);
        String str=null;
        if(str.equals("aaa")){
            System.out.println("....");
        }

    }
}
