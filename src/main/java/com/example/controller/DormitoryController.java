package com.example.controller;

import com.example.pojo.Dormitory;
import com.example.service.dormitory.DormitoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class DormitoryController {
    @Autowired
    DormitoryService dormitoryService;

    // 查询全部宿舍
    @GetMapping("/dormitoryList")
    public String getDormitoryList(String queryDormNo, String queryDormHonour, Model model){
        if (queryDormNo == null){
            queryDormNo = "";
        }
        if (queryDormHonour == null){
            queryDormHonour = "";
        }
        List<Dormitory> dormitories = dormitoryService.getDormitoryList(queryDormNo, queryDormHonour);
        model.addAttribute("dormitories", dormitories);
        model.addAttribute("queryDormNo", queryDormNo);
        model.addAttribute("queryDormHonour", queryDormHonour);
        return "dormitoryList";
    }

    // 根据id查学生
    @GetMapping("/viewDormitory/{id}")
    public String getDormitory(@PathVariable("id") Integer id, Model model){
        Dormitory dormitory = dormitoryService.getDormitoryById(id);
        model.addAttribute("dormitory", dormitory);
        return "dormitoryView";
    }

    @GetMapping("/dormitoryAdd")
    public String toAddDormitory(Model model) {

        return "dormitoryAdd";
    }
    @PostMapping("/addDormitory")
    public String addDormitory(Dormitory dormitory) {
        //添加的操作
        System.out.println("save=>" + dormitory);
        dormitoryService.addDormitory(dormitory);
        return "redirect:/dormitoryList";
    }
    @GetMapping("/dormitoryUpdate/{id}")
    public String toUpdateDormitory(@PathVariable("id") Integer id,Model model) {
        Dormitory dormitory = dormitoryService.getDormitoryById(id);
        model.addAttribute("dormitory", dormitory);
        return "dormitoryUpdate";
    }
    @PostMapping("/updateDormitory")
    public String updateDormitory(Dormitory dormitory){
        dormitoryService.updateDormitory(dormitory);
        System.out.println("update=>" + dormitory);
        return "redirect:/dormitoryList";
    }
    @GetMapping("/deleteDormitory/{id}")
    public String deleteDormitory(@PathVariable("id") int id){
        dormitoryService.deleteDormitoryById(id);
        return "redirect:/dormitoryList";
    }
}
