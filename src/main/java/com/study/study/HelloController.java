package com.study.study;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HelloController {

    HelloService helloService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("hello")
    public String hello(Model model) {
        String str = helloService.getDemo();
        model.addAttribute("data", str);
        System.out.println("LOG: " + str);
        logger.info("INFO TEST");
        logger.debug("DEBUG TEST");
        return "hello";
    }

    @PostMapping("hello2")
    public ResponseEntity create(){
        Map<String, String> map = new HashMap<>();
        String str = helloService.getDemo();
        map.put("data", str);
        System.out.println("TEST: " + str);

        return new ResponseEntity<>(map, HttpStatus.OK);
    }
}
