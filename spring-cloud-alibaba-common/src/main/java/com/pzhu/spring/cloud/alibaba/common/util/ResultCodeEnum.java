package com.pzhu.spring.cloud.alibaba.common.util;

/**
 * @author joy-survey team
 * @Description 状态码列表
 */
public enum ResultCodeEnum {
    SUCCESS("1", "成功"),
    FAIL("2", "失败");
    String code;
    String msg;

    ResultCodeEnum(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}