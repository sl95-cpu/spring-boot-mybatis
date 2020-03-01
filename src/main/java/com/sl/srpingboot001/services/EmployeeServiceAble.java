package com.sl.srpingboot001.services;

import com.sl.srpingboot001.pojo.Employee;

import java.util.Collection;
import java.util.List;

public interface EmployeeServiceAble {
    //查询所有的员工
    List<Employee> getEmployee();
    //添加员工
    int addEmployee(Employee employee);
    //删除员工
    int deleteEmployee( int id);
    //根据员工id查询员工
    Employee getEmployeeById( int id);
    //修改员工信息
    int updateEmployee(Employee employee);
}
