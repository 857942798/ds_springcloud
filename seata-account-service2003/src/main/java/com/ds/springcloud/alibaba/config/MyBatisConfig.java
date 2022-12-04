package com.ds.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.ds.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
