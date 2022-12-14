package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/21 17:15
 */
@Mapper
public interface OrderDao {
    //1.新建订单
    void create(Order order);

    //2.修改订单状态,从0改为1
    void update(@Param("userId")Long userId,@Param("status")Integer status);

}
