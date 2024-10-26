package com.example.controller;

import com.example.pojo.Student;
import com.example.service.student.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    // 查询全部学生
    @GetMapping("/studentList")
    public String getStudentList(String queryStuName, String queryDormNo, String queryStuClass, Model model){
        if (queryStuName == null){
            queryStuName = "";
        }
        if (queryDormNo == null){
            queryDormNo = "";
        }
        if (queryStuClass == null){
            queryStuClass = "";
        }

        List<Student> students = studentService.getStudentList(queryStuName, queryDormNo, queryStuClass);
        model.addAttribute("students", students);
        model.addAttribute("queryStuName", queryStuName);
        model.addAttribute("queryDormNo", queryDormNo);
        model.addAttribute("queryStuClass", queryStuClass);
        return "studentList";
    }
    // 根据id查学生
    @GetMapping("/viewStudent/{id}")
    public String getStudent(@PathVariable("id") Integer id,Model model){
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "studentView";
    }

    @GetMapping("/studentAdd")
    public String toAddStudent(Model model) {
        //要查出所有专业的信息
        //List<Student> students = studentService.getStudents();
        //model.addAttribute("students", students);
        return "studentAdd";
    }
    @PostMapping("/addStudent")
    public String addStudent(Student student) {
        //添加的操作
        student.setPassword(student.getStuNo().substring(4,10));//默认密码学号后6位
        System.out.println("save=>" + student);
        studentService.addStudent(student);
        return "redirect:/studentList";
    }

    @GetMapping("/studentUpdate/{id}")
    public String toUpdateStudent(@PathVariable("id") Integer id,Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "studentUpdate";
    }
    @PostMapping("/updateStudent")
    public String updateStudent(Student student){
        studentService.updateStudent(student);
        System.out.println("update=>" + student);
        return "redirect:/studentList";
    }

    @GetMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable("id") int id){
        studentService.deleteStudentById(id);
        return "redirect:/studentList";
    }
}
