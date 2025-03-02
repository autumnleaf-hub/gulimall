package com.fzy.gulimall.product;

import com.fzy.gulimall.product.bean.Brand;
import com.fzy.gulimall.product.service.BrandService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
public class GulimallProductApplicationTests {

    @Resource
    BrandService brandService;

    @Test
    public void contextLoads() {
        Brand brand = new Brand();
        brand.setName("oppo");
        brandService.save(brand);
        log.info(brandService.getById(brand.getBrandId()).toString());
    }

}
