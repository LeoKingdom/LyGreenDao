package com.ly.mydb.history.bean;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.io.Serializable;
import java.util.List;

import org.greenrobot.greendao.annotation.Generated;

/**
 * author: LingYun
 * email: SWD-yun.ling@jrdcom.com
 * date: 2019/6/19 13:33
 * version: 1.0
 */

@Entity
public class HistorySaveLocalBean implements Serializable {
    private static final long serialVersionUID = 1L;
    private String deviceId;
    private String date;
    private String startDate;
    private String endDate;
    @Generated(hash = 93126837)
    public HistorySaveLocalBean(String deviceId, String date, String startDate,
            String endDate) {
        this.deviceId = deviceId;
        this.date = date;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    @Generated(hash = 1571447403)
    public HistorySaveLocalBean() {
    }
    public String getDeviceId() {
        return this.deviceId;
    }
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    public String getDate() {
        return this.date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getStartDate() {
        return this.startDate;
    }
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    public String getEndDate() {
        return this.endDate;
    }
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
   
}
