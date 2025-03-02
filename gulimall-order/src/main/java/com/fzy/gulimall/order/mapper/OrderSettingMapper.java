package com.fzy.gulimall.order.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fzy.gulimall.order.bean.OrderSetting;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 订单配置信息 Mapper 接口
 * </p>
 *
 * @author fzy
 * @since 2025-03-01
 */
@Mapper
public interface OrderSettingMapper extends BaseMapper<OrderSetting> {

}

