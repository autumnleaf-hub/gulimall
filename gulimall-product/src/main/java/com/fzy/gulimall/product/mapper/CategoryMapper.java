package com.fzy.gulimall.product.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fzy.gulimall.product.bean.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 商品三级分类 Mapper 接口
 * </p>
 *
 * @author fzy
 * @since 2025-03-01
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}

