package com.ryanjbaxter.spring.cloud.ocr.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class OcrWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(OcrWebApplication.class, args);
    }

}
