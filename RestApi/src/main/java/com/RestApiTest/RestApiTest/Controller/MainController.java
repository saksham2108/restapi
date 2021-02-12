package com.RestApiTest.RestApiTest.Controller;

import com.RestApiTest.RestApiTest.Entity.Employee;
import com.RestApiTest.RestApiTest.Service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api")
public class MainController {

    @Autowired
    private final MainService mainService;

    public MainController(MainService mainService) {
        this.mainService = mainService;
    }

    @GetMapping
    @RequestMapping(path = "/details")
    public List<Employee> getAllDetails(){
        return mainService.getAllDetails();
    }

    @PostMapping
    @RequestMapping(path = "/saveemployeedetils")
    @ResponseBody
    public String saveEmployeeDetails(@RequestParam("email") String email, @RequestParam("name") String name){
        this.mainService.saveEmployee(email,name);
        return "OK";
    }

}
