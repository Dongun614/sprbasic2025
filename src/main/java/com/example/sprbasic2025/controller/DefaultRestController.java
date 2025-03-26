package com.example.sprbasic2025.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("/multiple") //RestController 앞에는 api라고 주소 붙이기(암묵적인)
    //RequestMapping의 받아오는 방식이 Get이라서 위와 같이 한다
    public Map<String, Object> multiple(int a, int b){
        System.out.println("a : " + a + ", b : " + b);
        int result = a * b;

        Map<String, Object> resultmap = new HashMap<>();
        resultmap.put("status",200);
        resultmap.put("data", "hahaha");
        return resultmap;
    }

    @GetMapping("/login")
    public Map<String, Object> login(@RequestParam String id, @RequestParam String pw){
        System.out.println("id : " + id + ", pw : " + pw);
        int resultCode = 0;
        if("1234".equals(id) && "1111".equals(pw)){
            resultCode = 200;
        }
        Map<String, Object> resultmap = new HashMap<>();
        resultmap.put("status",resultCode);
        return resultmap;
    }
}
