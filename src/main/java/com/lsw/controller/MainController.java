package com.lsw.controller;

import com.lsw.dto.testDTO;
import com.lsw.service.TestService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("")
    public String home(){
        return "index";
    }

    @RequestMapping("/detail")
    public String detail(){
        return "detail/detail";
    }
}
