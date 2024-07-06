package com.aja.employeemanagementsystem.entity;

import jakarta.persistence.*;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Employee
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "empId")
    private Integer empId;

    @NotNull(message = "Name is mandotory")
    @Column(name = "empName")
    private String empName;

    @NotNull(message = "Salery is mandotory")
    @Column(name = "empSal")
    private Double empSal;

    @Email(message = "Email should be valid")
    @Column(name = "email")
    private String email;

    @NotNull(message = "Deptno is mandotory")
    @Column(name = "deptNo")
    private Integer deptNo;
}
