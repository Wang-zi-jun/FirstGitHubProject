package com.fengqing.bean;

import java.util.Data; //实体类所需类导包

public class Student {
    //属性层
        private Integer stuId; //
        private String stuNo; //
        private String stuName; //
        private Integer stuGender; //
        private Integer sutAge; //
        private String stuTel; //
        private String stuAddress; //
        private Date stuEnrollmentTime; //
        private Date sutCreatedTime; //
        private Integer stuClazzId; //
    //setget层
        public Integer getStuId() {
        return stuId;
        }

        public void setStuId(Integer stuId) {
        this.stuId = stuId;
        }
        public String getStuNo() {
        return stuNo;
        }

        public void setStuNo(String stuNo) {
        this.stuNo = stuNo;
        }
        public String getStuName() {
        return stuName;
        }

        public void setStuName(String stuName) {
        this.stuName = stuName;
        }
        public Integer getStuGender() {
        return stuGender;
        }

        public void setStuGender(Integer stuGender) {
        this.stuGender = stuGender;
        }
        public Integer getSutAge() {
        return sutAge;
        }

        public void setSutAge(Integer sutAge) {
        this.sutAge = sutAge;
        }
        public String getStuTel() {
        return stuTel;
        }

        public void setStuTel(String stuTel) {
        this.stuTel = stuTel;
        }
        public String getStuAddress() {
        return stuAddress;
        }

        public void setStuAddress(String stuAddress) {
        this.stuAddress = stuAddress;
        }
        public Date getStuEnrollmentTime() {
        return stuEnrollmentTime;
        }

        public void setStuEnrollmentTime(Date stuEnrollmentTime) {
        this.stuEnrollmentTime = stuEnrollmentTime;
        }
        public Date getSutCreatedTime() {
        return sutCreatedTime;
        }

        public void setSutCreatedTime(Date sutCreatedTime) {
        this.sutCreatedTime = sutCreatedTime;
        }
        public Integer getStuClazzId() {
        return stuClazzId;
        }

        public void setStuClazzId(Integer stuClazzId) {
        this.stuClazzId = stuClazzId;
        }
}