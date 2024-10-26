package com.example.service.notice;

import com.example.mapper.NoticeMapper;
import com.example.pojo.Notice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoticeServiceImpl implements NoticeService {
    @Autowired
    NoticeMapper noticeMapper;

    @Override
    public List<Notice> getNoticeList() {
        return noticeMapper.getNoticeList();
    }

    @Override
    public int addNotice(Notice notice) {
        return noticeMapper.addNotice(notice);
    }

    @Override
    public Notice getNoticeById(Integer id) {
        return noticeMapper.getNoticeById(id);
    }

    @Override
    public int deleteNoticeById(Integer id) {
        return noticeMapper.deleteNoticeById(id);
    }

    @Override
    public int updateNotice(Notice notice) {
        return noticeMapper.updateNotice(notice);
    }

}
