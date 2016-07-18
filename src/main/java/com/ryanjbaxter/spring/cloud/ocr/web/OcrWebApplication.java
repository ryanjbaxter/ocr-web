package com.ryanjbaxter.spring.cloud.ocr.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;

@SpringBootApplication
@EnableDiscoveryClient 
@EnableZuulProxy
public class OcrWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(OcrWebApplication.class, args);
    }

    @Bean
    public AlwaysSampler defaultSampler() {
        return new AlwaysSampler();
    }
}
