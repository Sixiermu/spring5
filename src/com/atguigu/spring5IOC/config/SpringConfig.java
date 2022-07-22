package com.atguigu.spring5IOC.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//设置扫描文件范围
@ComponentScan(basePackages = {"com.atguigu"})
public class SpringConfig {

}
