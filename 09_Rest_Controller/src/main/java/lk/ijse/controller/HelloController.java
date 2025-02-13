package lk.ijse.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("mapping")
public class HelloController {
    @GetMapping
    public String test1(){
        return "get mapping invoke";
    }
    @PostMapping
    public String test2(){
        return "post mapping working";
    }
    @PutMapping
    public String test3(){
        return "put mapping working";
    }
    @DeleteMapping
    public String test4(){
        return "delete mapping working";
    }
    @PatchMapping
    public String test5(){
        return "patch mapping working";
    }
}
