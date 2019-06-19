package com.ly.mydb.history.bean;

import java.io.Serializable;

/**
 * author: LingYun
 * email: SWD-yun.ling@jrdcom.com
 * date: 2019/6/19 14:00
 * version: 1.0
 */
public class DeviceLocationBean implements Serializable {
    //4种定位模式
    public static final int GPS = 0x001;
    public static final int BTS = 0x010;
    public static final int WIFI = 0x100;
    public static final int SOS = 0x8000;

    public double lat;//纬度
    public double lng;//精度
    public String addr;
    public int accuracy;//精度
    public long time;//定时时间
    public int type;//定位方式
    public boolean online;//设备是否在线  不一定有值
    public int power;//电量 不一定有值
    public String did;//设备id  不一定有值
    public String profile;//设备头像

    public DeviceLocationBean(){

    }

    public String getProfile() {
        return profile;
    }

    public void setProfile(String profile) {
        this.profile = profile;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLng() {
        return lng;
    }

    public void setLng(double lng) {
        this.lng = lng;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "DeviceLocationBean{" +
                "lat=" + lat +
                ", lng=" + lng +
                ", addr='" + addr + '\'' +
                ", accuracy=" + accuracy +
                ", time=" + time +
                ", type=" + type +
                ", online=" + online +
                ", power=" + power +
                ", did='" + did + '\'' +
                ", profile='" + profile + '\'' +
                '}';
    }
}
