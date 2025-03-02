package com.fzy.gulimall.order.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fzy.gulimall.order.bean.PaymentInfo;
import com.fzy.gulimall.order.mapper.PaymentInfoMapper;
import com.fzy.gulimall.order.service.PaymentInfoService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 支付信息表 服务实现类
 * </p>
 *
 * @author fzy
 * @since 2025-03-01
 */
@Service
public class PaymentInfoServiceImp extends ServiceImpl<PaymentInfoMapper, PaymentInfo> implements PaymentInfoService {

}
