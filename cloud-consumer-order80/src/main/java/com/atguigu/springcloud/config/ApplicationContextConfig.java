package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/16 16:34
 */
@Configuration
public class ApplicationContextConfig {
    //applicationContext.xml <bean id ="RestTemplate" class = "RestTemplate">
    @Bean
    //@LoadBalanced //使用@LoadBalanced注解赋予RestTemplate负载均衡的能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
