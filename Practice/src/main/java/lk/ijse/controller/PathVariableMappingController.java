package lk.ijse.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("variable")
public class PathVariableMappingController {
    @PostMapping(path = "{id}/{name}")
    public String test1(@PathVariable("id") String id,
                        @PathVariable("name") String name){
        return id + " " +name;
    }
    @GetMapping(path = "{id}")
    public String test2(@PathVariable("id") String id){
        return id;
    }
}
