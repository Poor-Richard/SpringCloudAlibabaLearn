package com.pzhu.spring.cloud.alibaba.strategy.controller;

import com.pzhu.spring.cloud.alibaba.common.domain.BgBlog;

import com.pzhu.spring.cloud.alibaba.strategy.service.BgBlogServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author PoorRichard
 * @Date  19:03
 */
@RestController
public class BgBlogController {

    @Autowired
    private BgBlogServiceFeign serviceFeign;

    /**
     * 查询列表
     * @return
     */
    @GetMapping("list")
    public List<BgBlog> list(){
        return serviceFeign.list();
    }
}
