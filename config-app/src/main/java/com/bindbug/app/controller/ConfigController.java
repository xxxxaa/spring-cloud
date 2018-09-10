package com.bindbug.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: dylan
 * @Date: 2018/9/10 下午4:51
 */
@RestController
@RequestMapping("/")
public class ConfigController {

    @RequestMapping("test.json")
    public String test(){
        return "this is json";
    }
}
