package com.sunqianwen.datacenter.controller.elapsedtime;

import com.sunqianwen.datacenter.mapper.TimeAspectLogMapper;
import com.sunqianwen.datacenter.model.TimeAspectLog;
import com.sunqianwen.datacenter.util.ResultResponse;
import com.sunqianwen.datacenter.vo.TimeAspectLogVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MoXingwang on 2017/5/6.
 */
@Controller
public class ElapsedtimeController {

    @Autowired
    private TimeAspectLogMapper timeAspectLogMapper;

    @RequestMapping(value = "/times",method = RequestMethod.GET)
    @ResponseBody
    public ResultResponse<List<TimeAspectLog>> listTimes() {
        ResultResponse resultResponse = new ResultResponse();

        List<TimeAspectLog> timeAspectLogs = timeAspectLogMapper.listTimeAspectLogs();

        List<TimeAspectLogVO> timeAspectLogVOS = new ArrayList<>();
        if(null != timeAspectLogs){
            for (TimeAspectLog aspectLog : timeAspectLogs) {
                TimeAspectLogVO timeAspectLogVO = new TimeAspectLogVO();
                timeAspectLogVO.setId(aspectLog.getId());
                timeAspectLogVO.setCreateDate(aspectLog.getCreateDate());
                timeAspectLogVO.setUsedTimes(aspectLog.getUsedTimes());
                timeAspectLogVOS.add(timeAspectLogVO);
            }
        }

        resultResponse.setData(timeAspectLogVOS);
        return resultResponse;
    }
}
