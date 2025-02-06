package lk.ijse.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("variable")
public class PathVariableController {
    @GetMapping(path = "{id}")
    public String test1(
            @PathVariable("id") String id){
        return id;
    }
    @GetMapping(path = "{id}/{name}")
    public String test2(@PathVariable("id") String id,
                        @PathVariable("name") String name){
        return id + " " + name;
    }
    @GetMapping(path = "{id:[A][0-9]{3}}/{name}")
    public String test3(@PathVariable("id") String id,
                        @PathVariable("name") String name){

        return id + " " + name;
    }
}
