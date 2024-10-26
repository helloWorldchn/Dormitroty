package com.example.mapper;

import com.example.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//这个注解表示了这是一个mybatis的Mapper类
@Mapper
@Repository
public interface StudentMapper {

    // 获取所有学生信息
    List<Student> getStudentList(@Param("stuName") String stuName, @Param("dormNo") String dormNo, @Param("stuClass") String stuClass);
    // 通过id获得学生信息
    Student getStudentById(Integer id);
    //添加学生
    int addStudent(Student student);
    //修改学生信息
    int updateStudent(Student student);
    //删除学生信息
    int deleteStudentById(Integer id);
}
