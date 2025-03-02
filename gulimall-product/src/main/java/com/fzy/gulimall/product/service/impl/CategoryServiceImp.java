package com.fzy.gulimall.product.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fzy.gulimall.product.bean.Category;
import com.fzy.gulimall.product.mapper.CategoryMapper;
import com.fzy.gulimall.product.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 商品三级分类 服务实现类
 * </p>
 *
 * @author fzy
 * @since 2025-03-01
 */
@Service
public class CategoryServiceImp extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
