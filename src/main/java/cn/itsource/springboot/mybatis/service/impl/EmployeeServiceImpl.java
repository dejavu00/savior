package cn.itsource.springboot.mybatis.service.impl;

import cn.itsource.springboot.mybatis.domain.Employee;
import cn.itsource.springboot.mybatis.mapper.EmployeeMapper;
import cn.itsource.springboot.mybatis.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    @Transactional
    @Override
    public void saveOne(Employee employee) {
        employeeMapper.saveOne(employee);
    }
    @Transactional
    @Override
    public void deleteOneById(Serializable id) {
        employeeMapper.deleteOneById(id);
    }
    @Transactional
    @Override
    public void updateOne(Employee employee) {
        employeeMapper.updateOne(employee);
    }

    @Override
    public Employee loadOneById(Serializable id) {
        return employeeMapper.loadOneById(id);
    }

    @Override
    public List<Employee> LoadAll() {
        return employeeMapper.LoadAll();
    }
}
