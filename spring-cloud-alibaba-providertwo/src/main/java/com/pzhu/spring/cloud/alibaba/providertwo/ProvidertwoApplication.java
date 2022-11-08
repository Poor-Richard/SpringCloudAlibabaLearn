package com.pzhu.spring.cloud.alibaba.providertwo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 服务提供者
 * @Author PoorRichard
 * @Date  15:02
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.pzhu.spring.cloud.alibaba.providertwo.dao")
public class ProvidertwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProvidertwoApplication.class, args);
    }

}
