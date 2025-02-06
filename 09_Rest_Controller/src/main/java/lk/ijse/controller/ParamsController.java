package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("params")
public class ParamsController {
    //http://localhost:8080/09_Rest_Controller_war_exploded/params?id=12
    @GetMapping(params = {"id"})
    public String test1(@RequestParam("id") String id){
        return id;
    }
    //http://localhost:8080/09_Rest_Controller_war_exploded/params?id=12&name=Dhanu
    @GetMapping(params = {"id","name"})
    public String test2(@RequestParam("id") String id , @RequestParam("name") String name){
        return id + " " + name;
    }
    //http://localhost:8080/09_Rest_Controller_Web_exploded/params/new?id=1&name=dhanu
    @GetMapping(path = "new" , params = {"id","name"})
    public String test3(@RequestParam("id") String id , @RequestParam("name") String name){
        return id + " " + name;
    }
}
