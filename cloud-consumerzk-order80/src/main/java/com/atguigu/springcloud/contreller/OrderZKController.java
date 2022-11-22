package com.atguigu.springcloud.contreller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/17 10:32
 */
@RestController
@Slf4j
public class OrderZKController {

    public static final String INVOKE_URI = "http://cloud-provider-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/zk")
    public String paymentInfo(){
        return restTemplate.getForObject(INVOKE_URI+"/payment/zk",String.class);
    }
}
