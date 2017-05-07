package com.sunqianwen.datacenter.vo;

import java.util.Date;

/**
 * Created by MoXingwang on 2017/4/27.
 */
public class TimeAspectLogVO {
    private Long id;
    private long usedTimes;
    private Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getUsedTimes() {
        return usedTimes;
    }

    public void setUsedTimes(long usedTimes) {
        this.usedTimes = usedTimes;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
