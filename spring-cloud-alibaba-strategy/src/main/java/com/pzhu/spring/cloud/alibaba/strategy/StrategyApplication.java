package com.pzhu.spring.cloud.alibaba.strategy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 服务消费者
 * @Author PoorRichard
 * @Date  15:02
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients("com.pzhu.spring.cloud.alibaba.strategy.service")
@MapperScan("com.pzhu.spring.cloud.alibaba.strategy.dao")
public class StrategyApplication {

    public static void main(String[] args) {
        SpringApplication.run(StrategyApplication.class, args);
    }

}
