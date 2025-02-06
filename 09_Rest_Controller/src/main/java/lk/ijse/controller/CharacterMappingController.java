package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("character")
public class CharacterMappingController {
    @GetMapping(path = "test1/I???")
    public String test1(){
        return "Hello Character test1";
    }
    @GetMapping(path = "???/test2")
    public String test2(){
        return "Hello Character test2";
    }
}
