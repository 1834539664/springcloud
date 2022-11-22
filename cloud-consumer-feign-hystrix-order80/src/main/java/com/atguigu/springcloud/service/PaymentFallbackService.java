package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/17 23:29
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "paymentInfo_OK fall back";
    }

    @Override
    public String paymentInfo_Timeout(Integer id) {
        return "paymentInfo_Timeout fall back";
    }
}
