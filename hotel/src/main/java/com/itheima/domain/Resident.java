package com.itheima.domain;

import java.util.Date;

public class Resident {

    private Integer id; //住户id
    private String name;//住户姓名
    private Date timeCut; //入住截止日期
    private Date timeUse; //入住时间
    private Date timeOut; //退房时间
    private Integer isUse;// 住房状态
    private Home home;//房间信息
    private String phoneNumber; //住户电话
    private Integer accountId; //前台人员id外键
    private Account account; //办理入住的管理员

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTimeCut() {
        return timeCut;
    }

    public void setTimeCut(Date timeCut) {
        this.timeCut = timeCut;
    }

    public Date getTimeUse() {
        return timeUse;
    }

    public void setTimeUse(Date timeUse) {
        this.timeUse = timeUse;
    }

    public Date getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(Date timeOut) {
        this.timeOut = timeOut;
    }

    public Integer getIsUse() {
        return isUse;
    }

    public void setIsUse(Integer isUse) {
        this.isUse = isUse;
    }

    public Home getHome() {
        return home;
    }

    public void setHome(Home home) {
        this.home = home;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Resident{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", timeCut=" + timeCut +
                ", timeUse=" + timeUse +
                ", timeOut=" + timeOut +
                ", isUse=" + isUse +
                ", home=" + home +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", accountId=" + accountId +
                ", account=" + account +
                '}';
    }
}
