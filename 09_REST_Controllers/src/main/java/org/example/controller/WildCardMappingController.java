package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wild")
public class WildCardMappingController {
    //wild/test/abc/hello - worked
    //wild/test/abc123/hello - worked

    //wild/test/hello - not worked
    //wild/test/abc123/de/hello - not worked
    @GetMapping("test/*/hello")
    public String hello() {
        return "Hello World";
    }
    //wild/hello/1/  - worked
    //wild/hello/1/2  - worked
    @GetMapping("hello/*/*")
    public String hello1() {
        return "Hello World1";
    }
}
