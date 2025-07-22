package org.example.controller;

import org.example.dto.UserDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("form")
public class FormURLDataController {
//    @PostMapping("save")
//    public String saveUser(@RequestParam Map<String, String> formData) {
//        for (Map.Entry<String, String> entry : formData.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//        return "Save User";
//    }
    @PostMapping("save")
    public String saveUser(@ModelAttribute UserDto userDto) {
        System.out.println(userDto);
        return "Save User";
    }
}
