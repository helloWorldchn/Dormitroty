package com.example.service.role;

import com.example.pojo.Role;

import java.util.List;

public interface RoleService {

    List<Role> getRoleList();

    Role getRole(Integer id);
}
