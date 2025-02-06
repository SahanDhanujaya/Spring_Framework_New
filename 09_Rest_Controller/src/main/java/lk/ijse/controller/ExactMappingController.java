package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("exact")
public class ExactMappingController {
    @GetMapping("test1")
    public String test1(){
        return "Hello test1 ";
    }
    @GetMapping("test2")
    public String test2(){
        return "Hello test2";
    }
}
