package com.dt.info.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HelloController
 * @Author Roy
 * @Description //TODO $end$
 * @Date 2018/9/3 17:14
 **/
@RestController
public class HelloController {
    @RequestMapping("/index")
    public String hello(){
        return "hello world !!!";
    }
}
