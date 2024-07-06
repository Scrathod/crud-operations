package com.aja.employeemanagementsystem.service;

import com.aja.employeemanagementsystem.entity.Employee;

import java.util.List;

public interface EmployeeService
{
    Employee addEmployee(Employee employee);

    List<Employee> addEmployees(List<Employee> employeeList);

    Employee getEmployee(Integer empId);

    List<Employee> getAllEmployees();

    Employee updateEmployee(Integer empId,Employee employee);




}
