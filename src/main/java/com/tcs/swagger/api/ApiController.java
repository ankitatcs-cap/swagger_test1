package com.tcs.swagger.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
    @GetMapping("/hello")
    public String hellotcs()
    {
        return "Hello TCS";
    }
    @GetMapping("/your string")
    public  String yourRequest(@RequestParam String req)
    {
        return req;
    }
}

