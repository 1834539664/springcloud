package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import com.mysql.jdbc.log.Log;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/16 14:55
 */
@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
