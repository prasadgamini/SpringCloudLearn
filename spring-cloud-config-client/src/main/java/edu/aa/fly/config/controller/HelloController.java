package edu.aa.fly.config.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${sample.numberOfLessons}")
    private int numberOfLessons;

    @Value("${cs.travelinfo.maxversion}")
    private int csMajorVersion;

    @RequestMapping("/hi")
    public String sayHi(){
        System.out.printf("ONV");
        return "ONV..." + numberOfLessons + " ...  " + csMajorVersion;
    }
}
