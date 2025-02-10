package lk.ijse.controller;

import lk.ijse.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("json")
public class JSONController {
    ArrayList<CustomerDTO> customers = new ArrayList<>();
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public String save(@RequestBody CustomerDTO customerDTO){
        customers.add(customerDTO);
        return customerDTO.toString();
    }
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<CustomerDTO> getCustomer(@RequestBody CustomerDTO customerDTO){
      return customers;
    }
    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE ,produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO update(@RequestBody CustomerDTO customerDTO){
        for (CustomerDTO customerDTO1:customers) {
            if (customerDTO1.getId().equals(customerDTO.getId())){
                customerDTO1.setName(customerDTO.getName());
                customerDTO1.setAge(customerDTO.getAge());
                return customerDTO1;
            }

        }
        return null;
    }
    @DeleteMapping(params = {"id"})
    public List<CustomerDTO> delete(@RequestParam("id") String id){
        System.out.println(id);
        for (CustomerDTO customerDTO1:customers) {
            if (customerDTO1.getId().equals(id)){
                customers.remove(customerDTO1);
            }
        }
        return customers;
    }
}
