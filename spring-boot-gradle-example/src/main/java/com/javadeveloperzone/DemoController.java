package com.javadeveloperzone;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping(value = "hello")
    public String hello(){
        return "Spring boot Gradle Example";
    }

    public String hai(){
        return "Hai this is custom method";
    }
}
