package com.example.service.student;

import com.example.pojo.Student;

import java.util.List;

public interface StudentService {
    // 获取所有学生信息
    List<Student> getStudentList(String stuName, String dormNo, String stuClass);
    // 通过id获得学生信息
    Student getStudentById(Integer id);
    //添加学生
    int addStudent(Student student);
    //修改学生信息
    int updateStudent(Student student);
    //删除学生信息
    int deleteStudentById(Integer id);
}
