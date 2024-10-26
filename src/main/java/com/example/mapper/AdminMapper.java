package com.example.mapper;

import com.example.pojo.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper : 表示本类是一个 MyBatis 的 Mapper
@Mapper
@Repository
public interface AdminMapper {

	// 获取所有员工信息
	List<Admin> getAdminList(@Param("queryAdminName") String queryAdminName, @Param("queryAdminRole") int queryAdminRole);

	// 新增一个员工
    int addAdmin(Admin admin);

    // 通过id获得员工信息
    Admin getAdminById(Integer id);

    // 通过id删除员工
    int deleteAdminById(Integer id);

    // 更改员工信息
    int updateAdmin(Admin admin);

    Admin getLoginAdmin(String adminCode);

}
