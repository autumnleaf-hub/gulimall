package com.fzy.gulimall.order.mapper;

import com.fzy.gulimall.order.bean.Order;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 订单 Mapper 接口
 * </p>
 *
 * @author fzy
 * @since 2025-03-01
 */
@Mapper
public interface OrderMapper extends BaseMapper<Order> {

}

