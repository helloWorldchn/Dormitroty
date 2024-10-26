package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Integer id;
    private String stuName;
    private String stuNo;
    private String stuClass;
    private String college;
    private String phone;
    private String password;
    private String dormNo;
    private String bedNo;
    private String gender;

}
