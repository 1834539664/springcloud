package com.atguigu.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/21 20:04
 */

@Mapper
public interface StorageDao {

    /**
     * 扣减库存
     */
    void decrease(@Param("productId") Long productId, @Param("count") Integer count);
}

