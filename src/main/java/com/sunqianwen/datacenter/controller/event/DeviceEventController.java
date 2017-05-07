package com.sunqianwen.datacenter.controller.event;

import com.sunqianwen.datacenter.model.DeviceInfo;
import com.sunqianwen.datacenter.mq.SenderDeviceEvent;
import com.sunqianwen.datacenter.util.ResultResponse;
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
public class DeviceEventController {

    @Autowired
    private SenderDeviceEvent senderDeviceEvent;

    @RequestMapping(value = "/event/open",method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse<List<DeviceInfo>> listDeviceInfos(@RequestParam(value = "command",required = true)String command) {
        ResultResponse resultResponse = new ResultResponse();
        senderDeviceEvent.send(command);
        return resultResponse;
    }
}
