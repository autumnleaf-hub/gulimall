package com.fzy.gulimall.member.bean;

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
 * 积分变化历史记录
 * </p>
 *
 * @author fzy
 * @since 2025-03-01
 */
@Getter
@Setter
@ToString
@TableName("ums_integration_change_history")
public class IntegrationChangeHistory implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * member_id
     */
    @TableField("member_id")
    private Long memberId;

    /**
     * create_time
     */
    @TableField("create_time")
    private LocalDateTime createTime;

    /**
     * 变化的值
     */
    @TableField("change_count")
    private Integer changeCount;

    /**
     * 备注
     */
    @TableField("note")
    private String note;

    /**
     * 来源[0->购物；1->管理员修改;2->活动]
     */
    @TableField("source_tyoe")
    private Integer sourceTyoe;
}
