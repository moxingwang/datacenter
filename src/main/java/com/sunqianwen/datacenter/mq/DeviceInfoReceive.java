package com.sunqianwen.datacenter.mq;

import com.alibaba.fastjson.JSON;
import com.sunqianwen.datacenter.mapper.DeviceInfoMapper;
import com.sunqianwen.datacenter.model.DeviceInfo;
import org.apache.log4j.Logger;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by MoXingwang on 2017/5/6.
 */
@Component
public class DeviceInfoReceive {

    private Logger logger = Logger.getLogger(DeviceInfoReceive.class);


    @Autowired
    private DeviceInfoMapper deviceInfoMapper;

    //todo 修改topic
    @RabbitListener(queues="topic.deviceEventMessage")    //监听器监听指定的Queue
    public void process(String str) {
        try{
            DeviceInfo deviceInfo = JSON.parseObject(str, DeviceInfo.class);

            deviceInfoMapper.insert(deviceInfo);
        }catch (Exception e){
            logger.error("DeviceInfoReceive error",e);
        }
    }


}
