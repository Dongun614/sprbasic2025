package com.example.sprbasic2025.controller;


import com.example.sprbasic2025.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@RequestMapping("/api/notice")
@RestController
public class NoticeRestController {

    //@Autowired
    final NoticeService noticeService; //생성자 방식
    NoticeRestController(NoticeService noticeService) {
        this.noticeService = noticeService;
    }

    @GetMapping("/create")
    public int create(@RequestParam String title, String content, @RequestParam String author){
        int resultCode = noticeService.create(title, content, author);
        return resultCode;
    }

    @GetMapping("/list")
    public List<Map<String, Object>> list(String title, String author){
        List<Map<String, Object>> resultData = noticeService.list(title, author);
        return resultData;
    }

    @GetMapping("/detail")
    public Map<String, Object> detail(@RequestParam int id){
        Map<String, Object> notice = noticeService.detail(id);
        return notice;
    }
}
