package com.aja.employeemanagementsystem.service;

import com.aja.employeemanagementsystem.entity.Employee;
import com.aja.employeemanagementsystem.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService
{

    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public Employee addEmployee(Employee employee) {
        Employee save = employeeRepo.save(employee);
        return save;

    }

    @Override
    public List<Employee> addEmployees(List<Employee> employeeList)
    {
        List<Employee> listSave = employeeRepo.saveAll(employeeList);
        return listSave;
    }

    @Override
    public Employee getEmployee(Integer empId) {
        Employee byId = employeeRepo.findById(empId).get();
        return byId;
    }

    @Override
    public List<Employee> getAllEmployees()
    {
        List<Employee> all = employeeRepo.findAll();
        return all;
    }

    @Override
    public Employee updateEmployee(Integer empId,Employee employee) {
        Employee emp = employeeRepo.findById(empId).get();
        emp.setEmpName(employee.getEmpName());
        emp.setEmpSal(employee.getEmpSal());
        emp.setEmail(employee.getEmail());
        emp.setDeptNo(employee.getDeptNo());

        employeeRepo.save(emp);
        return emp;

    }
}
