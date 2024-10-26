package com.example.controller;

import com.example.mapper.RoleMapper;
import com.example.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class RoleController {
    @Autowired
    RoleMapper roleMapper;

    // 查询全部部门
    @GetMapping("/roleList")
    public List<Role> getRoleList(){
        return roleMapper.getRoleList();
    }
    // 查询全部部门
    @GetMapping("/getRole/{id}")
    public Role getRole(@PathVariable("id") Integer id){
        return roleMapper.getRole(id);
    }

}
