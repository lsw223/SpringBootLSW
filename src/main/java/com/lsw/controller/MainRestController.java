package com.lsw.controller;

import com.lsw.dto.testDTO;
import com.lsw.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainRestController {

    private final TestService testService;

    @Autowired
    public MainRestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping("/detailInfo")
    public testDTO detailInfo(){
        return testService.selectDetailInfo();
    }
}
