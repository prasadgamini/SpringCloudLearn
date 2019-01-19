package edu.aa.fly.config.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ConfigurationProperties(prefix = "wordConfig")
@RestController
public class LuckyWordController {

    private String luckyWord;
    private String preamble;

    @GetMapping("/lucky-word")
    public String getLuckyWord(){
        return String.join(":", preamble, luckyWord);
    }
}
