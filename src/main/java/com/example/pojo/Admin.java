package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin {
    private Integer id;
    private String adminName;
    private String adminCode;
    private String adminPhone;
    private Integer gender;	//1 male, 0 female
    private Integer adminRole;
    private String adminPassword;
    private Role aRole; // 冗余设计

}
