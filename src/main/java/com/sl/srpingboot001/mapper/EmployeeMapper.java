package com.sl.srpingboot001.mapper;

import com.sl.srpingboot001.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeMapper {
     //查询所有的员工
      List<Employee> getEmployee();
      //添加员工
      int addEmployee(Employee employee);
      //删除员工
     int deleteEmployee(@Param("id") Integer id);
     //根据员工id查询员工
     Employee getEmployeeById(@Param("id") Integer id);
     //修改员工信息
      int updateEmployee(Employee employee);
}
