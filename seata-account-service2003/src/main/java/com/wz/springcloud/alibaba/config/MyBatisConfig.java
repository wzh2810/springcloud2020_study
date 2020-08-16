package com.wz.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan({"com.wz.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
