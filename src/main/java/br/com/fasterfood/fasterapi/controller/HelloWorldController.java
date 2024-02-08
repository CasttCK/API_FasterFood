package br.com.fasterfood.fasterapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloWorldController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello";
    }
}
