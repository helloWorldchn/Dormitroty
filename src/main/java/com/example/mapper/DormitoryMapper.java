package com.example.mapper;

import com.example.pojo.Dormitory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//这个注解表示了这是一个mybatis的Mapper类
@Mapper
@Repository
public interface DormitoryMapper {

    // 获取所有宿舍信息
    List<Dormitory> getDormitoryList(@Param("dormNo") String dormNo, @Param("dormHonour") String dormHonour);
    // 通过id获得宿舍信息
    Dormitory getDormitoryById(Integer id);
    //添加宿舍
    int addDormitory(Dormitory dormitory);
    //修改宿舍信息
    int updateDormitory(Dormitory dormitory);
    //删除宿舍信息
    int deleteDormitoryById(Integer id);
}
