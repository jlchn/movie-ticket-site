package com.jlchn.movie.provider.start;

import com.alibaba.dubbo.config.annotation.Service;
import com.jlchn.movie.ServiceAPI;
import org.springframework.stereotype.Component;

@Service(interfaceClass = ServiceAPI.class)
@Component
public class StartServiceImpl implements ServiceAPI {

    public String sendMessage(String message) {
        return "provider message: " + message;
    }
}
