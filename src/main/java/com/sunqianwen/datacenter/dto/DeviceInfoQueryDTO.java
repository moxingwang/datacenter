package com.sunqianwen.datacenter.dto;

import java.util.Date;

/**
 * Created by MoXingwang on 2017/4/24.
 */
public class DeviceInfoQueryDTO {
    private String deviceId;
    private Date startDate;
    private Date endDate;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
