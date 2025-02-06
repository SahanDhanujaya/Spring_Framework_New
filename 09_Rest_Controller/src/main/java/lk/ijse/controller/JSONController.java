package lk.ijse.controller;

import lk.ijse.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("json")
public class JSONController {
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public String test1(@RequestBody CustomerDTO customerDTO){
        return customerDTO.toString();
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO test2(){
        return new CustomerDTO(1,"Dhanu",21);
    }
    @GetMapping(path = "getAll" , produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CustomerDTO> getAllCustomer(){
        ArrayList<CustomerDTO> customerDTOS = new ArrayList<>();
        customerDTOS.add(new CustomerDTO(1,"sahan",21));
        customerDTOS.add(new CustomerDTO(2,"Dhanu",21));
        customerDTOS.add(new CustomerDTO(3,"sahan",20));
        return customerDTOS;
    }

}
