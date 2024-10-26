package com.example.controller;

import com.example.pojo.Admin;
import com.example.pojo.Role;
import com.example.pojo.Student;
import com.example.service.role.RoleService;
import com.example.service.admin.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Collection;
import java.util.List;

@Controller
public class AdminController {
    @Autowired
    AdminService adminService;

    @Autowired
    RoleService roleService;

    @RequestMapping("/adminList")
    public String getAdminList(String queryName, String queryAdminRole, Model model) {
        int adminRole = 0;// 用户角色 默认为0
        //根据前端传来的信息做转化
        if (queryName == null){
            queryName = "";
        }
        if (queryAdminRole!=null && !queryAdminRole.trim().equals("")){
            adminRole = Integer.parseInt(queryAdminRole);//给查询赋值! 0,1,2,3
        }

        List<Admin> admins = adminService.getAdminList(queryName,adminRole);
        List<Role> roleList = roleService.getRoleList();
        for (int i = 0; i < admins.size(); i++) {
            System.out.println(admins.get(i));
        }
        model.addAttribute("admins", admins);
        model.addAttribute("roleList", roleList);
        model.addAttribute("queryAdminName", queryName);
        model.addAttribute("queryAdminRole", adminRole);
        return "adminList";
    }

    // 根据id查学生
    @GetMapping("/viewAdmin/{id}")
    public String getStudent(@PathVariable("id") Integer id, Model model){
        Admin admin = adminService.getAdminById(id);
        model.addAttribute("admin", admin);
        return "adminView";
    }
    @GetMapping("/adminAdd")
    public String toAddAdmin(Model model) {
        //要查出所有部门的信息
        List<Role> roles = roleService.getRoleList();
        model.addAttribute("roles", roles);
        return "adminAdd";
    }

    @PostMapping("/addAdmin")
    public String addAdmin(Admin admin) {
        //添加的操作
        System.out.println("save=>" + admin);
        adminService.addAdmin(admin);
        return "redirect:/adminList";
    }

    //跳转到员工的修改界面
    @GetMapping("/adminUpdate/{id}")
    public String toUpdateAdmin(@PathVariable("id") Integer id, Model model) {
        //查出原来的数据
        Admin admin = adminService.getAdminById(id);
        model.addAttribute("admin", admin);
        //要查出所有部门的信息
        Collection<Role> roles = roleService.getRoleList();
        model.addAttribute("roles", roles);
        return "adminUpdate";
    }

    @PostMapping("/updateAdmin")
    public String updateAdmin(Admin admin) {
        System.out.println("update=>" + admin);
        adminService.updateAdmin(admin);
        return "redirect:/adminList";
    }

    //删除员工
    @GetMapping("/deleteAdmin/{id}")
    public String deleteAdmin(@PathVariable("id") int id) {
        adminService.deleteAdminById(id);
        return "redirect:/adminList";
    }

}
