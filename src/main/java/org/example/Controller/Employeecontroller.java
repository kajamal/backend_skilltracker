package org.example.Controller;

import org.example.Enitity.Employee;
import org.example.Service.Employeeservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Employeecontroller {

    @Autowired
    Employeeservice employeeservice;

    @PostMapping("/createemp")
    private String create(@RequestBody  Employee employee){
        String s = employeeservice.createemployee(employee);
        return s;


    }

    @GetMapping ("/getall")
        private List<Employee> getalldata() {
            return employeeservice.getall();

        }
    }

