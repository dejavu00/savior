package cn.itsource.springboot.mybatis.service.impl;

import cn.itsource.springboot.mybatis.App;
import cn.itsource.springboot.mybatis.domain.Department;
import cn.itsource.springboot.mybatis.domain.Employee;
import cn.itsource.springboot.mybatis.service.IEmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes=App.class)
public class EmployeeServiceImplTest {

    @Autowired
    IEmployeeService employeeService;

    @Test
    public void saveOne() {
        Employee bobo = new Employee("jerry", "688");
        bobo.setDepartment(new Department(2L));
        employeeService.saveOne(bobo);
    }

    @Test
    public void deleteOneById() {
        employeeService.deleteOneById(55L);
    }

    @Test
    public void updateOne() {
        Employee employee = employeeService.loadOneById(55L);
        employee.setUsername("jerry");
        employee.setPassword("333");
        employee.setDepartment(new Department(666L));
        employeeService.updateOne(employee);
    }

    @Test
    public void loadOneById() {
        Employee employee = employeeService.loadOneById(52L);
        System.out.println(employee);
    }

    @Test
    public void loadAll() {
        List<Employee> employees = employeeService.LoadAll();
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}