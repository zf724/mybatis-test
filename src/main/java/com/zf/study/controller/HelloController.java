package com.zf.study.controller;

import com.zf.study.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/index")
    public String index(Integer id){
        helloService.getClassById(id);
        return "index";
    }
}
