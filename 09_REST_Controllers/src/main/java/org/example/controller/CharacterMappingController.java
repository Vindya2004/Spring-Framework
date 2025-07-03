package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("char")
public class CharacterMappingController {
    //char/item/I123 - worked
    //char/item/Iabc - worked
    //char/item/I&&& - worked

    //char/item/i123 - not worked
    //char/item/I1234 - not worked
    @GetMapping("item/I???")
    public String sayHello() {
        return "sayHello";
    }
    //char/1234/search - worked
    //char/   /search - worked
    //char/@@@@/search - worked
    @GetMapping("????/search")
    public String hello() {
        return "hello";
    }
}
