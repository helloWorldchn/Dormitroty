package com.example.service.dormitory;

import com.example.pojo.Dormitory;

import java.util.List;

public interface DormitoryService {
    // 获取所有宿舍信息
    List<Dormitory> getDormitoryList(String dormNo, String dormHonour);
    // 通过id获得宿舍信息
    Dormitory getDormitoryById(Integer id);
    //添加宿舍
    int addDormitory(Dormitory dormitory);
    //修改宿舍信息
    int updateDormitory(Dormitory dormitory);
    //删除宿舍信息
    int deleteDormitoryById(Integer id);
}
