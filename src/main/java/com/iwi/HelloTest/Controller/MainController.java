package com.iwi.HelloTest.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String Health(){
        return "Server has been opened";
    }
    @GetMapping("/test")
    public String Test(){
        return "This for test bro :x 한국어 인코딩 잘되나요?";
    }
}
