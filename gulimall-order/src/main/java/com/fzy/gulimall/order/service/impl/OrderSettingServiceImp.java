package com.fzy.gulimall.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fzy.gulimall.order.bean.OrderSetting;
import com.fzy.gulimall.order.mapper.OrderSettingMapper;
import com.fzy.gulimall.order.service.OrderSettingService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单配置信息 服务实现类
 * </p>
 *
 * @author fzy
 * @since 2025-03-01
 */
@Service
public class OrderSettingServiceImp extends ServiceImpl<OrderSettingMapper, OrderSetting> implements OrderSettingService {

}
