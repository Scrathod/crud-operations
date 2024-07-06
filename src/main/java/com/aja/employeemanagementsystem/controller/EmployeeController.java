package com.aja.employeemanagementsystem.controller;

import com.aja.employeemanagementsystem.entity.Employee;
import com.aja.employeemanagementsystem.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController
{

    @Autowired
    private EmployeeService service;

    @PostMapping("/addEmployee")
    public ResponseEntity<Employee> addEmployee(@Valid @RequestBody Employee employee)
    {
        Employee employee1 = service.addEmployee(employee);
        return ResponseEntity.status(HttpStatus.OK).body(employee1);
    }

    @PostMapping("/addListOfEmployee")
    public ResponseEntity<List<Employee>> addListOfEmployee(@Valid @RequestBody List<Employee> employeeList)
    {
        List<Employee> employees = service.addEmployees(employeeList);
        return ResponseEntity.status(HttpStatus.OK).body(employees);
    }

    @GetMapping("/getEmployee/{empId}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Integer empId)
    {
        Employee employee = service.getEmployee(empId);
        return ResponseEntity.status(HttpStatus.OK).body(employee);
    }

    @GetMapping("/getAllEmployees")
    public ResponseEntity<List<Employee>> getAllEmployees()
    {
        List<Employee> allEmployees = service.getAllEmployees();
        return ResponseEntity.status(HttpStatus.OK).body(allEmployees);
    }

    @PutMapping("/updateEmployee/{empId}")
    public ResponseEntity<Employee> updateEmployee(@PathVariable Integer empId, @Valid @RequestBody Employee employee)
    {
        Employee employee1 = service.updateEmployee(empId, employee);

        return ResponseEntity.status(HttpStatus.OK).body(employee1);
    }


}
