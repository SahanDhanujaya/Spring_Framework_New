package lk.ijse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("wildcard")
public class WildCardMappingController {
    @GetMapping("test1/*/hello")
    public String test1(){
        return "Hello wildcard test1";
    }
    @GetMapping("test2/*/*")
    public String test2(){
        return "Hello wildcard test2";
    }

}
