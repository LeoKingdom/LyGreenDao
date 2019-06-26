package com.ly.mydb.history.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Property;
import org.greenrobot.greendao.annotation.Generated;

/**
 * author: LingYun
 * email: SWD-yun.ling@jrdcom.com
 * date: 2019/6/19 15:04
 * version: 1.0
 */
@Entity
public class MyLatLng {
    private String startTime;
    private String endTime;
    private String deviceId;
    private String listId;
    private double lat;
    private double lng;
    private String address;
    @Generated(hash = 1284658248)
    public MyLatLng(String startTime, String endTime, String deviceId,
            String listId, double lat, double lng, String address) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.deviceId = deviceId;
        this.listId = listId;
        this.lat = lat;
        this.lng = lng;
        this.address = address;
    }
    @Generated(hash = 1862737912)
    public MyLatLng() {
    }
    public String getStartTime() {
        return this.startTime;
    }
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
    public String getEndTime() {
        return this.endTime;
    }
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
    public String getDeviceId() {
        return this.deviceId;
    }
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    public String getListId() {
        return this.listId;
    }
    public void setListId(String listId) {
        this.listId = listId;
    }
    public double getLat() {
        return this.lat;
    }
    public void setLat(double lat) {
        this.lat = lat;
    }
    public double getLng() {
        return this.lng;
    }
    public void setLng(double lng) {
        this.lng = lng;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

   
}
