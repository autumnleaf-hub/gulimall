package com.fzy.gulimall.ware.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;
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
@TableName("wms_ware_order_task")
public class WareOrderTask implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * order_id
     */
    @TableField("order_id")
    private Long orderId;

    /**
     * order_sn
     */
    @TableField("order_sn")
    private String orderSn;

    /**
     * 收货人
     */
    @TableField("consignee")
    private String consignee;

    /**
     * 收货人电话
     */
    @TableField("consignee_tel")
    private String consigneeTel;

    /**
     * 配送地址
     */
    @TableField("delivery_address")
    private String deliveryAddress;

    /**
     * 订单备注
     */
    @TableField("order_comment")
    private String orderComment;

    /**
     * 付款方式【 1:在线付款 2:货到付款】
     */
    @TableField("payment_way")
    private Boolean paymentWay;

    /**
     * 任务状态
     */
    @TableField("task_status")
    private Integer taskStatus;

    /**
     * 订单描述
     */
    @TableField("order_body")
    private String orderBody;

    /**
     * 物流单号
     */
    @TableField("tracking_no")
    private String trackingNo;

    /**
     * create_time
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 仓库id
     */
    @TableField("ware_id")
    private Long wareId;

    /**
     * 工作单备注
     */
    @TableField("task_comment")
    private String taskComment;
}
