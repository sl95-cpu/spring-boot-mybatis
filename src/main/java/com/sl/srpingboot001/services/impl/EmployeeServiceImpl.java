package com.sl.srpingboot001.services.impl;

import com.sl.srpingboot001.mapper.EmployeeMapper;
import com.sl.srpingboot001.pojo.Employee;
import com.sl.srpingboot001.services.EmployeeServiceAble;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeServiceAble {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> getEmployee() {
        return employeeMapper.getEmployee();
    }

    @Override
    public int addEmployee(Employee employee) {
        return employeeMapper.addEmployee(employee);
    }

    @Override
    public int deleteEmployee(int id) {
        return employeeMapper.deleteEmployee(id);
    }

    @Override
    public Employee getEmployeeById(int id) {
        return employeeMapper.getEmployeeById(id);
    }

    @Override
    public int updateEmployee(Employee employee) {
        return employeeMapper.updateEmployee(employee);
    }
}
