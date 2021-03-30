package com.turing.sb2.controller;

import com.turing.sb2.Sb2Application;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@Slf4j
public class HelloController {

    //获取日志对象
    //private Logger log = LoggerFactory.getLogger(Sb2Application.class);

    @GetMapping("/h")
    public String hello(){
//        log.debug("---HelloController控制器启动了---");
//        log.info("---HelloController控制器启动了---");
//        log.warn("---HelloController控制器启动了---");
//        log.error("---HelloController控制器启动了---");
        return "Hello";
    }
}
