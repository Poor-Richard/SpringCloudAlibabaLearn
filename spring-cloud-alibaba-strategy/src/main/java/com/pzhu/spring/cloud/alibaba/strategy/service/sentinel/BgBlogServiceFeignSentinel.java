package com.pzhu.spring.cloud.alibaba.strategy.service.sentinel;

import com.pzhu.spring.cloud.alibaba.common.domain.BgBlog;
import com.pzhu.spring.cloud.alibaba.strategy.service.BgBlogServiceFeign;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * BgBlogServiceFeign的熔断器
 * @Author PoorRichard
 * @Date  18:05
 */
@Component
public class BgBlogServiceFeignSentinel implements BgBlogServiceFeign {
    @Override
    public List<BgBlog> list() {
        ArrayList list = new ArrayList<BgBlog>();
        BgBlog blog = new BgBlog();
        blog.setTitle("hello Sentinel");
        list.add(blog);
        return list;
    }
}
