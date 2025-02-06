package lk.ijse.controller;

import lk.ijse.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("form")
public class FormDataController {
    @PostMapping(path = "test1")
    public String test1(@RequestParam("id") String id , @RequestParam("name") String name){
        return id + " " + name;
    }
    @PostMapping(path = "test2")
    public String test2(@ModelAttribute CustomerDTO customerDTO){
        return customerDTO.toString();
    }

}
