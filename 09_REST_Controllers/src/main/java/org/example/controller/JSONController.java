package org.example.controller;

import org.example.dto.CityDto;
import org.example.dto.UserDto;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("json")
public class JSONController {
    @PostMapping(value = "save",consumes = MediaType.APPLICATION_JSON_VALUE)
    public String save(@RequestBody UserDto userDto) {
        System.out.println(userDto);
        return "Saved";
    }
    @GetMapping("get")
    public UserDto get() {
        CityDto cityDto = new CityDto();
        cityDto.setName("San Francisco");
        cityDto.setCode("21200");

        UserDto userDto = new UserDto();
        userDto.setUid("123");
        userDto.setuName("John");
        userDto.setuPassword("1234");
        userDto.setuCity(cityDto);



        return userDto;

    }

}
