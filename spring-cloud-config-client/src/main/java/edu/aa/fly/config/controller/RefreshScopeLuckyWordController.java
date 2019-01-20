package edu.aa.fly.config.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RefreshScope
@ConfigurationProperties(prefix = "word-config")
@RestController
public class RefreshScopeLuckyWordController {
    private String preamble;
    private String luckyWord;

    private String fullSentence;

    @PostConstruct
    public void init() {
        fullSentence =  String.join(" : " , preamble, luckyWord);
    }

    @GetMapping("/lucky-word-2")
    public String getFullSentence(){
        return fullSentence;
    }

    public void setPreamble(String preamble) {
        this.preamble = preamble;
    }

    public void setLuckyWord(String luckyWord) {
        this.luckyWord = luckyWord;
    }
}
