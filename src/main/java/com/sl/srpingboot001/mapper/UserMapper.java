package com.sl.srpingboot001.mapper;

import com.sl.srpingboot001.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    //登录验证
    User login(User user);
}
