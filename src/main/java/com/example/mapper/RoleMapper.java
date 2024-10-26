package com.example.mapper;

import com.example.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//这个注解表示了这是一个mybatis的Mapper类
@Mapper
@Repository
public interface RoleMapper {

    // 获取所有部门信息
    List<Role> getRoleList();
    // 通过id获得部门
    Role getRole(Integer id);
}
