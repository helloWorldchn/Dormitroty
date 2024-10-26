package com.example.service.notice;

import com.example.pojo.Notice;

import java.util.List;

public interface NoticeService {

    List<Notice> getNoticeList();

    Notice getNoticeById(Integer id);

    int addNotice(Notice notice);

    int deleteNoticeById(Integer id);

    int updateNotice(Notice notice);

}
