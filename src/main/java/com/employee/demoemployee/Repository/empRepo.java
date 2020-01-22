package com.employee.demoemployee.Repository;

import com.employee.demoemployee.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface empRepo extends JpaRepository<Employee ,Long>
{

}