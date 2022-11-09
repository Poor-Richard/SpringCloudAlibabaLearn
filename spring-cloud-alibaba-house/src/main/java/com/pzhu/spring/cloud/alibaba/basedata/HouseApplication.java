package com.pzhu.spring.cloud.alibaba.basedata;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 *@Desc 服务提供者
 * @param
 *@Return
 *@Autor PoorRichard（huajian）
 *@CreateTime 2022/11/8
 *@Others
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.pzhu.spring.cloud.alibaba.house.dao")
public class HouseApplication {
    public static void main(String[] args) {
        SpringApplication.run(HouseApplication.class, args);
    }
}
