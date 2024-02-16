package com.saeed.hello;

import io.micrometer.observation.annotation.Observed;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Observed(name = "sayHello", lowCardinalityKeyValues = {"locale", "en-US"})
    public void sayHello() {
        System.out.println("Starting saying hello...");
    }

}
