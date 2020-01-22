package com.employee.demoemployee.Controller;

import com.employee.demoemployee.Entity.Employee;
import com.employee.demoemployee.Service.empService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/company")
public class empController
{
    @Autowired
    empService empservice;
    @PostMapping("/employees")
    public Employee createEmp(@Valid @RequestBody Employee emp)
    {
        return empservice.save(emp);
    }
    @GetMapping("/employees1")
    public Optional<Employee> getbyEmp(Long id)
    {
        return empservice.findById(id);
    }
    @DeleteMapping("/employees2")
    public Employee delemp(Employee emp)
    {
        return null;
    }
}
