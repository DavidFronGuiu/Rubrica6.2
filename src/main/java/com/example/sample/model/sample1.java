package com.example.sample.model;

import org.springframework.http.MediaType;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@SpringBootApplication
public class sample1
{
    @RequestMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String home() {
        return "Nothing here. Go to <a href='/sample'>/sample</a>";
    }

    static public void main(String[] args) throws Exception
    {
        SpringApplication.run(sample1.class, args);
    }
}