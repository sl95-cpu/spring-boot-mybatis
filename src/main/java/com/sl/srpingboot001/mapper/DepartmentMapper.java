package com.sl.srpingboot001.mapper;

import com.sl.srpingboot001.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Mapper
@Repository
public interface DepartmentMapper {
    //获得所有部门信息
    public List<Department> getDepartment();
    //通过id 得到部门
    public Department getDepartmentById(@Param("id") Integer id);
}
