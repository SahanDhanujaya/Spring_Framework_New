package lk.ijse.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello")
public class HelloController {
    @GetMapping("test1")
    public String test1(){
        return "Hello Spring";
    }
    @GetMapping("test2")
    public String test2(){
        return "Test2";
    }
    @PostMapping(path = "save")
    public String post(){
        return "Post Mapping is working";
    }
    @PutMapping
    public String put(){
        return "Put Mapping is working";
    }
    @DeleteMapping
    public String delete(){
        return "Delete Mapping is working";
    }
}
