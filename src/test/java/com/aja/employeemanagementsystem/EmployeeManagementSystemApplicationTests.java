package com.aja.employeemanagementsystem;

import com.aja.employeemanagementsystem.entity.Employee;
import com.aja.employeemanagementsystem.repo.EmployeeRepo;
import com.aja.employeemanagementsystem.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class EmployeeManagementSystemApplicationTests
{

    @Autowired
    private EmployeeService service;

    @MockBean
    private EmployeeRepo repo;

    @Test
    public void addEmployeeTest()
    {
        Employee e = new Employee();
        Employee emp = new Employee(101,"abcd",2100.54,"abcgmail.com",20);
        when(repo.save(emp)).thenReturn(emp);

       assertEquals(e,service.addEmployee(emp));
    }

}
