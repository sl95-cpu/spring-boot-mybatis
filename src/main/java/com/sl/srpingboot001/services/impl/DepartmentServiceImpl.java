package com.sl.srpingboot001.services.impl;

import com.sl.srpingboot001.mapper.DepartmentMapper;
import com.sl.srpingboot001.pojo.Department;
import com.sl.srpingboot001.services.DepartmentServiceAble;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentServiceAble {
    @Autowired
    private DepartmentMapper departmentMapper;
    @Override
    public List<Department> getDepartment() {
        return departmentMapper.getDepartment();
    }
    @Override
    public Department getDepartmentById(Integer id) {
        return departmentMapper.getDepartmentById(id);
    }
}
