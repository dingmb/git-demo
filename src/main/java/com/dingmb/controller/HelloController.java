package com.dingmb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dingmb
 * @create 2023-04-15
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        System.out.println("dingmb");
        return "git hello";
    }
}
