package com.pzhu.spring.cloud.alibaba.common.util;

import java.util.UUID;

/**
 * @author joy-survey team
 * @Description UUID工具类
 */
public class UUIDUtils {

    /**
     * 返回一个没有中划线的32位字符串
     * @return
     */
    public static String getUuid32(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
