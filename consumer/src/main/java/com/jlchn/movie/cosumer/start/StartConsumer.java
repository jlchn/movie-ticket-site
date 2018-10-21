package com.jlchn.movie.cosumer.start;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.dubbo.config.annotation.Service;
import com.jlchn.movie.ServiceAPI;
import org.springframework.stereotype.Component;

@Component
public class StartConsumer {

    @Reference
    private ServiceAPI serviceAPI;
    public void sendMessage(String message) {
        System.out.println(serviceAPI.sendMessage(message));
    }
}
