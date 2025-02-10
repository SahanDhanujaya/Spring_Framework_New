package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("param")
public class ParamMappingController {
    @GetMapping(params = {"id","name","age"})
    public String test1(@RequestParam("id") String id,@RequestParam("name") String name,@RequestParam("age") int age){
        return id + " " + name + " " + age;
    }
}
