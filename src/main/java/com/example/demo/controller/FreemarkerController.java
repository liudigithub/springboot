package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

/**
 * Created by liudi on 2018/8/20.
 */
@Controller
@RequestMapping("/ftl")
public class FreemarkerController {

    @RequestMapping("/hello")
    public String hello(Map<String,Object> map) {
        map.put("message", "hello,world");

        return "ftl/hello";
    }

    @RequestMapping("/login")
    public String login(Map<String,Object> map) {
        map.put("message", "hello,world");

        return "ftl/Modern_admin/login";
    }

    @RequestMapping("/index")
    public String index(Map<String,Object> map) {
        map.put("message", "hello,world");

        return "ftl/Modern_admin/index";
    }

}