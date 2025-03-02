package com.fzy.gulimall.ware.bean;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * <p>
 * 
 * </p>
 *
 * @author fzy
 * @since 2025-03-01
 */
@Getter
@Setter
@ToString
@TableName("wms_purchase_detail")
public class PurchaseDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 采购单id
     */
    @TableField("purchase_id")
    private Long purchaseId;

    /**
     * 采购商品id
     */
    @TableField("sku_id")
    private Long skuId;

    /**
     * 采购数量
     */
    @TableField("sku_num")
    private Integer skuNum;

    /**
     * 采购金额
     */
    @TableField("sku_price")
    private BigDecimal skuPrice;

    /**
     * 仓库id
     */
    @TableField("ware_id")
    private Long wareId;

    /**
     * 状态[0新建，1已分配，2正在采购，3已完成，4采购失败]
     */
    @TableLogic
    @TableField("status")
    private Integer status;
}
