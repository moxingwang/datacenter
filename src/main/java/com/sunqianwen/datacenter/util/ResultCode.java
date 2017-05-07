package com.sunqianwen.datacenter.util;

public enum ResultCode {

    C200("200", "Success"),

    C403("403", "Forbidden"),
    C400("400", "Bad Request"),
    C404("404", "Not Found"),
    C410("410", "Gone"),

    C500("500", "Internal Server Error")

    ;
    ResultCode(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String code;//code
    public String desc;//description

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
