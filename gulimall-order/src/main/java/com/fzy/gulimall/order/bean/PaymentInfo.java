package com.fzy.gulimall.order.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
/**
 * <p>
 * 支付信息表
 * </p>
 *
 * @author fzy
 * @since 2025-03-01
 */
@Getter
@Setter
@ToString
@TableName("oms_payment_info")
public class PaymentInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 订单号（对外业务号）
     */
    @TableField("order_sn")
    private String orderSn;

    /**
     * 订单id
     */
    @TableField("order_id")
    private Long orderId;

    /**
     * 支付宝交易流水号
     */
    @TableField("alipay_trade_no")
    private String alipayTradeNo;

    /**
     * 支付总金额
     */
    @TableField("total_amount")
    private BigDecimal totalAmount;

    /**
     * 交易内容
     */
    @TableField("subject")
    private String subject;

    /**
     * 支付状态
     */
    @TableField("payment_status")
    private String paymentStatus;

    /**
     * 创建时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 确认时间
     */
    @TableField("confirm_time")
    private LocalDateTime confirmTime;

    /**
     * 回调内容
     */
    @TableField("callback_content")
    private String callbackContent;

    /**
     * 回调时间
     */
    @TableField("callback_time")
    private LocalDateTime callbackTime;
}
