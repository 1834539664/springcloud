package com.atguigu.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/17 14:29
 */
public class MyselfRule {
    @Bean
    public IRule myRule()
    {
        return new RandomRule();//定义为随机
    }

}
