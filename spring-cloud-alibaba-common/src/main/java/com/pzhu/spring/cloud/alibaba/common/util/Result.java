package com.pzhu.spring.cloud.alibaba.common.util;
  import java.io.Serializable;

/**
 * @param <T>
 * @author joy-survey team
 * @Description 返回信息包装类
 */
public class Result<T> implements Serializable {

    public String code;

    public String msg;

    private T data;

    /**
     * 无参构造
     */
    public Result() {
    }

    /**
     * 根据code，msg创建一个Result
     *
     * @param code
     * @param msg
     */
    public Result(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 根据code，msg，data创建一个Result
     *
     * @param code
     * @param msg
     * @param data
     */
    public Result(String code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    /**
     * 根据枚举创建一个Result
     *
     * @param resultCodeEnum
     */
    public Result(ResultCodeEnum resultCodeEnum) {
        this.code = resultCodeEnum.getCode();
        this.msg = resultCodeEnum.getMsg();
    }


    public static final Result success() {
        Result result = new Result(ResultCodeEnum.SUCCESS);
        return result;
    }

    public static final <T> Result<T> success(T data) {
        Result result = new Result(ResultCodeEnum.SUCCESS);
        result.setData(data);
        return result;
    }

    public static final Result failure() {
        Result result = new Result(ResultCodeEnum.FAIL);
        return result;
    }


    /**
     * 根据枚举创建一个Result
     *
     * @param resultCodeEnum
     * @return
     */
    public static final <T> Result<T> result(ResultCodeEnum resultCodeEnum, T data) {
        Result result = new Result(resultCodeEnum);
        return result;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}