package com.study.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    HelloService helloService;

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("hello")
    public String hello(Model model) {
        String str = helloService.getDemo();
        model.addAttribute("data", str);
        System.out.println("LOG: " + str);
        return "hello";
    }
}
