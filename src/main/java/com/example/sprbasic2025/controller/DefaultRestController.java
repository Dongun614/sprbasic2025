package com.example.sprbasic2025.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RequestMapping("/api")
@RestController
public class DefaultRestController {

    @GetMapping("/test") //RestController 앞에는 api라고 주소 붙이기(암묵적인)
    //RequestMapping의 받아오는 방식이 Get이라서 위와 같이 한다
    public Map<String, Object> test(){
            Map<String, Object> map = new HashMap<>();
            map.put("status",200);
            map.put("data", "hahaha");
            return map;
    }
    @GetMapping("/abc")
    public Map<String, Object> abc(){
        return null;
    }

    @GetMapping("/multiple") //RestController 앞에는 api라고 주소 붙이기(암묵적인)
    //RequestMapping의 받아오는 방식이 Get이라서 위와 같이 한다
    public Map<String, Object> multiple(int a, int b){
        Map<String, Object> map = new HashMap<>();
        map.put("status",200);
        map.put("data", "hahaha");
        return map;
    }
}
