package com.pipi.limitservice.controller;

import com.pipi.limitservice.bean.LimistConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class limitConfiguringController {

    @GetMapping("/limits")
    public LimistConfiguration retriveLimitsFromConfigurations(){
        return new LimistConfiguration(100,1);
    }
}
