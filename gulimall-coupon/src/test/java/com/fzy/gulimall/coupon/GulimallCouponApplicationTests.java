package com.fzy.gulimall.coupon;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.fzy.gulimall.coupon.bean.Coupon;
import com.fzy.gulimall.coupon.service.CouponService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@Slf4j
@SpringBootTest
class GulimallCouponApplicationTests {

    @Resource
    CouponService couponService;

    @Test
    void contextLoads() {
        Coupon coupon = new Coupon();
        coupon.setCouponName("test coupon");

        couponService.save(coupon);

        log.info(couponService.getOne(new LambdaQueryWrapper<Coupon>().eq(Coupon::getId, coupon.getId())).toString());
    }

}
