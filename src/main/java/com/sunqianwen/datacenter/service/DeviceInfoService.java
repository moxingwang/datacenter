package com.sunqianwen.datacenter.service;

import com.sunqianwen.datacenter.mapper.DeviceInfoMapper;
import com.sunqianwen.datacenter.model.DeviceInfo;
import com.sunqianwen.datacenter.dto.DeviceInfoQueryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by m.
 */

@Service
public class DeviceInfoService {

    @Autowired
    private DeviceInfoMapper deviceInfoMapper;

    public List<DeviceInfo> listDeviceInfos(DeviceInfoQueryDTO deviceInfo){
        List<DeviceInfo> deviceInfos=deviceInfoMapper.listDeviceInfos(deviceInfo);
        return deviceInfos;
    }

}
