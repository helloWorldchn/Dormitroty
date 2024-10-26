package com.example.service.role;

import com.example.mapper.RoleMapper;
import com.example.pojo.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    RoleMapper roleMapper;

    @Override
    public List<Role> getRoleList() {
        return roleMapper.getRoleList();
    }

    @Override
    public Role getRole(Integer id) {
        return roleMapper.getRole(id);
    }
}
