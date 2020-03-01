package com.sl.srpingboot001.services;

import com.sl.srpingboot001.pojo.Department;

import java.util.Collection;
import java.util.List;

public interface DepartmentServiceAble {
    //获得所有部门信息
    public List<Department> getDepartment();
    //通过id 得到部门
    public Department getDepartmentById(Integer id);
}
