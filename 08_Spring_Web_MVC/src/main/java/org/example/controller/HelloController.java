package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
@RequestMapping("hello")
public class HelloController {
//    public HelloController() {
//        System.out.println("HelloController");
//    }
    @GetMapping
    public String hello() {
        return "index";
    }
//    @GetMapping
//    public String hello2() {
//        return "customer";
//    }
//    @GetMapping("one")
//    public String test1() {
//        return "Hello Test1";
//    }
//    @GetMapping("two")
//    public String test2() {
//        return "Hello Test2";
//    }
}
