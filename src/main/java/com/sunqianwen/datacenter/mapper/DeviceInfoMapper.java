package com.sunqianwen.datacenter.mapper;

import com.sunqianwen.datacenter.model.DeviceInfo;
import com.sunqianwen.datacenter.dto.DeviceInfoQueryDTO;

import java.util.List;

/**
 * Created by m.
 */
public interface  DeviceInfoMapper {
    List<DeviceInfo> listDeviceInfos(DeviceInfoQueryDTO deviceInfo);
    int insert(DeviceInfo deviceInfo);
}
