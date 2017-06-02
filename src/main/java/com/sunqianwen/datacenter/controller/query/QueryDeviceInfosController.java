package com.sunqianwen.datacenter.controller.query;

import com.sunqianwen.datacenter.dto.DeviceInfoQueryDTO;
import com.sunqianwen.datacenter.model.DeviceInfo;
import com.sunqianwen.datacenter.service.DeviceInfoService;
import com.sunqianwen.datacenter.util.ResultResponse;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by m.
 */
@Controller
public class QueryDeviceInfosController {

    private Logger logger = Logger.getLogger(QueryDeviceInfosController.class);

    @Autowired
    private DeviceInfoService deviceInfoService;

    @RequestMapping(value = "/deviceInfos",method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse<List<DeviceInfo>> listDeviceInfos(@RequestParam(value = "deviceId",required = false)String deviceId) {
        ResultResponse resultResponse = new ResultResponse();
        DeviceInfoQueryDTO deviceInfo = new DeviceInfoQueryDTO();
        deviceInfo.setDeviceId(deviceId);

        List<DeviceInfo> deviceInfos = deviceInfoService.listDeviceInfos(deviceInfo);
        resultResponse.setData(deviceInfos);
        if(deviceInfos==null){
            logger.info("empty");
        }

        return resultResponse;
    }
}
