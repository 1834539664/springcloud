package com.atguigu.springcloud.alibaba.domain;

import lombok.Data;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/21 20:03
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}

