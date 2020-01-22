package com.employee.demoemployee.Entity;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.Date;
@Entity
@Table(name="Employees")
@EntityListeners(AuditingEntityListener.class)//automatically generates created date
public class Employee
{
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
@NotBlank
private String name;

private Date createdAt;
@NotBlank
private String designation;
@NotBlank
private String expertise;

public  Employee()
{
}


    public Employee(Long id, @NotBlank String name, @NotBlank Date createdAt, @NotBlank String designation, @NotBlank String expertise) {
        this.id = id;
        this.name = name;
        this.createdAt = createdAt;
        this.designation = designation;
        this.expertise = expertise;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }
}


