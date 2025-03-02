package com.fzy.gulimall.coupon.bean;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDateTime;
/**
 * <p>
 * 秒杀活动场次
 * </p>
 *
 * @author fzy
 * @since 2025-02-28
 */
@Getter
@Setter
@ToString
@TableName("sms_seckill_session")
@ApiModel(value = "SeckillSession对象", description = "秒杀活动场次")
public class SeckillSession implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @ApiModelProperty("id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 场次名称
     */
    @TableField("name")
    @ApiModelProperty("场次名称")
    private String name;

    /**
     * 每日开始时间
     */
    @TableField("start_time")
    @ApiModelProperty("每日开始时间")
    private LocalDateTime startTime;

    /**
     * 每日结束时间
     */
    @TableField("end_time")
    @ApiModelProperty("每日结束时间")
    private LocalDateTime endTime;

    /**
     * 启用状态
     */
    @TableLogic
    @TableField("status")
    @ApiModelProperty("启用状态")
    private Boolean status;

    /**
     * 创建时间
     */
    @ApiModelProperty("创建时间")
    @TableField("create_time")
    private LocalDateTime createTime;
}
