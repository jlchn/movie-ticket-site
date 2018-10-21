package com.jlchn.movie.cosumer;


import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import com.jlchn.movie.cosumer.start.StartConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableDubboConfiguration
public class ConsumerApplication {

    public static void main(String[]args){

        System.out.println("hello this is consumer") ;
        ConfigurableApplicationContext run  = SpringApplication.run(ConsumerApplication.class);
        StartConsumer consumer = (StartConsumer)run.getBean("startConsumer");
        consumer.sendMessage("HHHHHHHHHHHHHHHHHHHH");
    }
}

