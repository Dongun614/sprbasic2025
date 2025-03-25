package com.example.sprbasic2025.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/notice")
@RestController
public class NoticeRestController {

    @GetMapping("/create")
    public int create(){
        return 1;
    }
}
