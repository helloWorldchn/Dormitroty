package com.example.service.admin;

import com.example.pojo.Admin;

import java.util.List;

public interface AdminService {

    List<Admin> getAdminList(String queryAdminName, int queryAdminRole);

    int addAdmin(Admin admin);

    Admin getAdminById(Integer id);

    int deleteAdminById(Integer id);

    int updateAdmin(Admin admin);

    Admin getLoginAdmin(String adminCode);
}
