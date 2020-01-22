package com.employee.demoemployee.Service;

import com.employee.demoemployee.Entity.Employee;
import com.employee.demoemployee.Repository.empRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class empService
{
    @Autowired
    empRepo emprepository;
    public Employee save(Employee emp)
    {
    return emprepository.save(emp);    //automatically saves data into db spring creates records data automatically
    }
    //search employees
    public List<Employee> findAll()
    {
        return emprepository.findAll();//returns all the employee details from the table
    }
    //get employee by id
    public Optional<Employee> findById(Long id)
    {
     return emprepository.findById(id);
    }
    //delete by id
    public Employee delete(Employee emp)
    {
       emprepository.delete(emp);
        return emp;
    }

}
