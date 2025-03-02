package com.fzy.gulimall.ware.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
/**
 * <p>
 * 商品库存
 * </p>
 *
 * @author fzy
 * @since 2025-03-01
 */
@Getter
@Setter
@ToString
@TableName("wms_ware_sku")
public class WareSku implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * sku_id
     */
    @TableField("sku_id")
    private Long skuId;

    /**
     * 仓库id
     */
    @TableField("ware_id")
    private Long wareId;

    /**
     * 库存数
     */
    @TableField("stock")
    private Integer stock;

    /**
     * sku_name
     */
    @TableField("sku_name")
    private String skuName;

    /**
     * 锁定库存
     */
    @TableField("stock_locked")
    private Integer stockLocked;
}
