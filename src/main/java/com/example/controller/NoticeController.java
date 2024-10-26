package com.example.controller;

import com.example.pojo.Admin;
import com.example.pojo.Notice;
import com.example.pojo.Role;
import com.example.pojo.Student;
import com.example.service.admin.AdminService;
import com.example.service.notice.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

@Controller
public class NoticeController {

    @Autowired
    NoticeService noticeService;

    @Autowired
    AdminService adminService;

    @RequestMapping("/noticeList")
    public String getNoticeList(Model model) {
        List<Notice> notices = noticeService.getNoticeList();

        model.addAttribute("notices", notices);

        return "noticeList";
    }

    // 根据id查公告
    @GetMapping("/viewNotice/{id}")
    public String getNotice(@PathVariable("id") Integer id, Model model){
        Notice notice = noticeService.getNoticeById(id);
        model.addAttribute("notice", notice);
        return "noticeView";
    }

    @GetMapping("/noticeAdd")
    public String toAddNotice(Model model) {
        //System.out.println("to add page!");
        return "noticeAdd";
    }

    @PostMapping("/addNotice")
    public String addNotice(Notice notice, HttpServletRequest request) {
        Admin loginUser = ((Admin) request.getSession().getAttribute("loginUser"));
        notice.setUid(loginUser.getId());
        notice.setCreationDate(new Date());
        System.out.println("save=>" + notice);
        noticeService.addNotice(notice);
        return "redirect:/noticeList";
    }


    // 根据id删除公告
    @GetMapping("/deleteNotice/{id}")
    public String deleteNotice(@PathVariable("id") Integer id, Model model){
        noticeService.deleteNoticeById(id);
        return "redirect:/noticeList";
    }

}
