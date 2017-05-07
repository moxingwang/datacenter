package com.sunqianwen.datacenter.mapper;

import com.sunqianwen.datacenter.model.TimeAspectLog;

import java.util.List;

/**
 * Created by MoXingwang on 2017/4/27.
 */
public interface TimeAspectLogMapper {
    int insert(TimeAspectLog timeAspectLog);

    List<TimeAspectLog> listTimeAspectLogs();
}
