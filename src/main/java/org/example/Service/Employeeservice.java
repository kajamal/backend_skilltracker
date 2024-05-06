package org.example.Service;


import org.example.Enitity.Employee;
import org.example.Repository.Employerepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Employeeservice {

    @Autowired
    Employerepo employerepo;

    public String createemployee (Employee employee){
        employerepo.save(employee);
        return "created";

    }
    public  List<Employee> getall(){

        return employerepo.findAll();

    }
}
