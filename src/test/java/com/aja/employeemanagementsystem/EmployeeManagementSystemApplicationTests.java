package com.aja.employeemanagementsystem;

import com.aja.employeemanagementsystem.entity.Employee;
import com.aja.employeemanagementsystem.repo.EmployeeRepo;
import com.aja.employeemanagementsystem.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.util.Assert;

import java.util.Optional;

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

        Employee expected = service.addEmployee(new Employee(101, "sbcd", 2100.54, "abcd@gmail.com", 20));
        Employee result = repo.save(expected);
        assertEquals(expected,result);


    }

    @Test
    public void getEmployeeTest()
    {
        Employee emp = new Employee();
        emp.setDeptNo(10);
        emp.setEmpSal(21.000);
        emp.setEmpName("abcd");
        emp.setEmail("abcd@gmail.com");
        emp.setEmpId(101);

        when(repo.findById(101)).thenReturn(Optional.of(emp));

        Employee result = service.getEmployee(101);

        assertEquals(emp,result);
    }

}
