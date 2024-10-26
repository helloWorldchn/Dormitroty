package com.example.service.student;

import com.example.mapper.StudentMapper;
import com.example.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    @Autowired
    StudentMapper studentMapper;

    public List<Student> getStudentList(String stuName, String dormNo, String stuClass) {
        return studentMapper.getStudentList(stuName, dormNo, stuClass);
    }

    public Student getStudentById(Integer id){
        return studentMapper.getStudentById(id);
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateStudent(student);
    }

    @Override
    public int deleteStudentById(Integer id) {
        return studentMapper.deleteStudentById(id);
    }
}
