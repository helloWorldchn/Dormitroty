package com.example.service.dormitory;

import com.example.mapper.DormitoryMapper;
import com.example.pojo.Dormitory;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DormitoryServiceImpl implements DormitoryService {
    @Autowired
    DormitoryMapper dormitoryMapper;

    @Override
    public List<Dormitory> getDormitoryList(String dormNo, String dormHonour) {
        return dormitoryMapper.getDormitoryList(dormNo, dormHonour);
    }

    @Override
    public Dormitory getDormitoryById(Integer id) {
        return dormitoryMapper.getDormitoryById(id);
    }

    @Override
    public int addDormitory(Dormitory dormitory) {
        return dormitoryMapper.addDormitory(dormitory);
    }

    @Override
    public int updateDormitory(Dormitory dormitory) {
        return dormitoryMapper.updateDormitory(dormitory);
    }

    @Override
    public int deleteDormitoryById(Integer id) {
        return dormitoryMapper.deleteDormitoryById(id);
    }
}
