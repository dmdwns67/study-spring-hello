package com.study.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HelloService {

    HelloRepository helloRepository;

    @Autowired
    public HelloService(HelloRepository helloRepository) {
        this.helloRepository = helloRepository;
    }

    public String getDemo() {
        Optional<Demo> demo = helloRepository.findById("test");
        return demo.toString();
    }
}
