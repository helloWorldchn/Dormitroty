package com.example.pojo;

public class Dormitory {
    private Integer id;
    private String dormNo;
    private String dormIntroduction;
    private String dormHonour;
    private String dormDirector;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDormNo() {
        return dormNo;
    }

    public void setDormNo(String dormNo) {
        this.dormNo = dormNo;
    }

    public String getDormIntroduction() {
        return dormIntroduction;
    }

    public void setDormIntroduction(String dormIntroduction) {
        this.dormIntroduction = dormIntroduction;
    }

    public String getDormHonour() {
        return dormHonour;
    }

    public void setDormHonour(String dormHonour) {
        this.dormHonour = dormHonour;
    }

    public String getDormDirector() {
        return dormDirector;
    }

    public void setDormDirector(String dormDirector) {
        this.dormDirector = dormDirector;
    }

    public Dormitory() {
    }

    public Dormitory(Integer id, String dormNo, String dormIntroduction, String dormHonour, String dormDirector) {
        this.id = id;
        this.dormNo = dormNo;
        this.dormIntroduction = dormIntroduction;
        this.dormHonour = dormHonour;
        this.dormDirector = dormDirector;
    }
}
