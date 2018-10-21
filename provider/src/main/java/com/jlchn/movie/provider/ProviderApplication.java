package com.jlchn.movie.provider;


import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfiguration
public class ProviderApplication {

    public static void main(String[]args){

        System.out.println("hello this is provider");
        SpringApplication.run(ProviderApplication.class);
    }
}

