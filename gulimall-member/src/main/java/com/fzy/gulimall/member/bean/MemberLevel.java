package com.fzy.gulimall.member.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * <p>
 * 会员等级
 * </p>
 *
 * @author fzy
 * @since 2025-03-01
 */
@Getter
@Setter
@ToString
@TableName("ums_member_level")
public class MemberLevel implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 等级名称
     */
    @TableField("name")
    private String name;

    /**
     * 等级需要的成长值
     */
    @TableField("growth_point")
    private Integer growthPoint;

    /**
     * 是否为默认等级[0->不是；1->是]
     */
    @TableField("default_status")
    private Integer defaultStatus;

    /**
     * 免运费标准
     */
    @TableField("free_freight_point")
    private BigDecimal freeFreightPoint;

    /**
     * 每次评价获取的成长值
     */
    @TableField("comment_growth_point")
    private Integer commentGrowthPoint;

    /**
     * 是否有免邮特权
     */
    @TableField("priviledge_free_freight")
    private Integer priviledgeFreeFreight;

    /**
     * 是否有会员价格特权
     */
    @TableField("priviledge_member_price")
    private Integer priviledgeMemberPrice;

    /**
     * 是否有生日特权
     */
    @TableField("priviledge_birthday")
    private Integer priviledgeBirthday;

    /**
     * 备注
     */
    @TableField("note")
    private String note;
}
