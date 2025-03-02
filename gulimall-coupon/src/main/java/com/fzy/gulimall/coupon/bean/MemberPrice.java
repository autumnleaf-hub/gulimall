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
import java.math.BigDecimal;
/**
 * <p>
 * 商品会员价格
 * </p>
 *
 * @author fzy
 * @since 2025-02-28
 */
@Getter
@Setter
@ToString
@TableName("sms_member_price")
@ApiModel(value = "MemberPrice对象", description = "商品会员价格")
public class MemberPrice implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * sku_id
     */
    @TableField("sku_id")
    @ApiModelProperty("sku_id")
    private Long skuId;

    /**
     * 会员等级id
     */
    @ApiModelProperty("会员等级id")
    @TableField("member_level_id")
    private Long memberLevelId;

    /**
     * 会员等级名
     */
    @ApiModelProperty("会员等级名")
    @TableField("member_level_name")
    private String memberLevelName;

    /**
     * 会员对应价格
     */
    @ApiModelProperty("会员对应价格")
    @TableField("member_price")
    private BigDecimal memberPrice;

    /**
     * 可否叠加其他优惠[0-不可叠加优惠，1-可叠加]
     */
    @TableField("add_other")
    @ApiModelProperty("可否叠加其他优惠[0-不可叠加优惠，1-可叠加]")
    private Boolean addOther;
}
