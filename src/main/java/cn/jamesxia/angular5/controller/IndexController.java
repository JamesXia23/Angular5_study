package cn.jamesxia.angular5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {
    IndexController(){
        System.out.println("hhhhhhh");
    }
    @GetMapping(value = {"/", "", "hello"})
    @ResponseBody
    public String hello(){
        return "hello springboot";
    }
}
