package com.sunqianwen.datacenter.model;

import java.util.Date;

/**
 * Created by MoXingwang on 2017/4/27.
 */
public class TimeAspectLog {
    private Long id;
    private String tag;
    private long usedTimes;
    private Date createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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
