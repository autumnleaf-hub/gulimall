package com.fzy.gulimall.product.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
/**
 * <p>
 * spu信息
 * </p>
 *
 * @author fzy
 * @since 2025-03-02
 */
@Data
@TableName("pms_spu_info")
public class SpuInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 商品id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品名称
     */
    @TableField("spu_name")
    private String spuName;

    /**
     * 商品描述
     */
    @TableField("spu_description")
    private String spuDescription;

    /**
     * 所属分类id
     */
    @TableField("catalog_id")
    private Long catalogId;

    /**
     * 品牌id
     */
    @TableField("brand_id")
    private Long brandId;

    @TableField("weight")
    private BigDecimal weight;

    /**
     * 上架状态[0 - 下架，1 - 上架]
     */
    @TableField("publish_status")
    private Integer publishStatus;

    @TableField("create_time")
    private LocalDateTime createTime;

    @TableField("update_time")
    private LocalDateTime updateTime;
}
