package com.atguigu.cloudalibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/20 23:11
 */
public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception){
        return new CommonResult(2020,"自定义的限流处理信息......CustomerBlockHandler");
    }
    public static CommonResult handleException2(BlockException exception){
        return new CommonResult(1314,"自定义的限流处理信息......CustomerBlockHandler");
    }
}
