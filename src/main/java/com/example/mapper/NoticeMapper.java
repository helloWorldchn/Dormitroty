package com.example.mapper;

import com.example.pojo.Notice;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper : 表示本类是一个 MyBatis 的 Mapper
@Mapper
@Repository
public interface NoticeMapper {
    // 获取所有通知信息
    List<Notice> getNoticeList();

    // 通过id获得通知信息
    Notice getNoticeById(Integer id);

    // 新增一个通知
    int addNotice(Notice notice);


    // 通过id删除通知
    int deleteNoticeById(Integer id);

    // 更改通知信息
    int updateNotice(Notice notice);

}
