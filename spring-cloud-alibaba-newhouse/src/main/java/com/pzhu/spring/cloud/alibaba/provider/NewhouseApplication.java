package com.pzhu.spring.cloud.alibaba.provider;

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
@MapperScan("com.pzhu.spring.cloud.alibaba.newhouse.dao")
public class NewhouseApplication {
    public static void main(String[] args) {
        SpringApplication.run(NewhouseApplication.class, args);
    }
}
