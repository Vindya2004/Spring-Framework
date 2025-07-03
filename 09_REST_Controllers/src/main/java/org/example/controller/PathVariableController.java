package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("path")
public class PathVariableController {
    @GetMapping("{id}")
    public String hello4(@PathVariable("id") String name) {
        return name;
    }

    @GetMapping("{name}/{age}")
    public String hello4(@PathVariable("name") String name,@PathVariable("age") int age) {
        return "Name :"+name +"Age :"+ age;
    }

    @GetMapping(path = "customer/{id:[I][0-9]{3}}")
    public String hello6(@PathVariable("id") String id) {
        return "hello6 "+id;
    }
    @GetMapping(path = "item/{code}/branch/{city}")
    public String hello7(@PathVariable("code") String code,@PathVariable("city") String city) {
        return "Item code: " + code + ", Branch city: " + city;
    }
    @GetMapping(path = "items/{code:[I][0-9]{3}}/branch/{city}")
    public String hello8(@PathVariable("code") String code,@PathVariable("city") String city) {
        return "Item code: " + code + ", Branch city: " + city;
    }
}
