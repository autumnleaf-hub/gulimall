package com.fzy.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fzy.gulimall.coupon.bean.HomeSubject;
import com.fzy.gulimall.coupon.mapper.HomeSubjectMapper;
import com.fzy.gulimall.coupon.service.HomeSubjectService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】 服务实现类
 * </p>
 *
 * @author fzy
 * @since 2025-02-28
 */
@Service
public class HomeSubjectServiceImp extends ServiceImpl<HomeSubjectMapper, HomeSubject> implements HomeSubjectService {

}
