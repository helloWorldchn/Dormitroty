package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Notice {

    private Integer id;
    private String title;
    private String content;
    private Integer uid;
    private Date creationDate;
    private Admin nAdmin; // 冗余设计

}
