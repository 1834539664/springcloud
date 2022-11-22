package com.atguigu.springcloud.alibaba.service;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/21 20:08
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}

