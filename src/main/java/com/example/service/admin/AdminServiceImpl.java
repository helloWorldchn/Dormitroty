package com.example.service.admin;

import com.example.mapper.AdminMapper;
import com.example.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    AdminMapper adminMapper;

    @Override
    public List<Admin> getAdminList(String queryAdminName, int queryAdminRole) {
        return adminMapper.getAdminList(queryAdminName, queryAdminRole);
    }

    @Override
    public int addAdmin(Admin admin) {
        return adminMapper.addAdmin(admin);
    }

    @Override
    public Admin getAdminById(Integer id) {
        return adminMapper.getAdminById(id);
    }

    @Override
    public int deleteAdminById(Integer id) {
        return adminMapper.deleteAdminById(id);
    }

    @Override
    public int updateAdmin(Admin admin) {
        return adminMapper.updateAdmin(admin);
    }

    @Override
    public Admin getLoginAdmin(String adminCode) {
        return adminMapper.getLoginAdmin(adminCode);
    }
}
