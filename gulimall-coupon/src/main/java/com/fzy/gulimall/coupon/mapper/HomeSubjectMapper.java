package com.fzy.gulimall.coupon.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fzy.gulimall.coupon.bean.HomeSubject;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 首页专题表【jd首页下面很多专题，每个专题链接新的页面，展示专题商品信息】 Mapper 接口
 * </p>
 *
 * @author fzy
 * @since 2025-02-28
 */
@Mapper
public interface HomeSubjectMapper extends BaseMapper<HomeSubject> {

}

