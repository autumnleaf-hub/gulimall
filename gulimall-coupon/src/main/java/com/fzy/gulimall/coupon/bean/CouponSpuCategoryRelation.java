package com.fzy.gulimall.coupon.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
/**
 * <p>
 * 优惠券分类关联
 * </p>
 *
 * @author fzy
 * @since 2025-02-28
 */
@Getter
@Setter
@ToString
@TableName("sms_coupon_spu_category_relation")
@ApiModel(value = "CouponSpuCategoryRelation对象", description = "优惠券分类关联")
public class CouponSpuCategoryRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 优惠券id
     */
    @TableField("coupon_id")
    @ApiModelProperty("优惠券id")
    private Long couponId;

    /**
     * 产品分类id
     */
    @TableField("category_id")
    @ApiModelProperty("产品分类id")
    private Long categoryId;

    /**
     * 产品分类名称
     */
    @ApiModelProperty("产品分类名称")
    @TableField("category_name")
    private String categoryName;
}
