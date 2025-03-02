package com.fzy.gulimall.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fzy.gulimall.order.bean.OrderItem;
import com.fzy.gulimall.order.mapper.OrderItemMapper;
import com.fzy.gulimall.order.service.OrderItemService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单项信息 服务实现类
 * </p>
 *
 * @author fzy
 * @since 2025-03-01
 */
@Service
public class OrderItemServiceImp extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
