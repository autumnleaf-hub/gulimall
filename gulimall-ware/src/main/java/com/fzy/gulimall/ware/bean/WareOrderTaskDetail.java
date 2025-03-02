package com.fzy.gulimall.ware.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
/**
 * <p>
 * 库存工作单
 * </p>
 *
 * @author fzy
 * @since 2025-03-01
 */
@Getter
@Setter
@ToString
@TableName("wms_ware_order_task_detail")
public class WareOrderTaskDetail implements Serializable {

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
     * sku_name
     */
    @TableField("sku_name")
    private String skuName;

    /**
     * 购买个数
     */
    @TableField("sku_num")
    private Integer skuNum;

    /**
     * 工作单id
     */
    @TableField("task_id")
    private Long taskId;

    /**
     * 仓库id
     */
    @TableField("ware_id")
    private Long wareId;

    /**
     * 1-已锁定  2-已解锁  3-扣减
     */
    @TableField("lock_status")
    private Integer lockStatus;
}
