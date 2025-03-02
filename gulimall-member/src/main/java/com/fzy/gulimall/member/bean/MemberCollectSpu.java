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
 * 会员收藏的商品
 * </p>
 *
 * @author fzy
 * @since 2025-03-01
 */
@Getter
@Setter
@ToString
@TableName("ums_member_collect_spu")
public class MemberCollectSpu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 会员id
     */
    @TableField("member_id")
    private Long memberId;

    /**
     * spu_id
     */
    @TableField("spu_id")
    private Long spuId;

    /**
     * spu_name
     */
    @TableField("spu_name")
    private String spuName;

    /**
     * spu_img
     */
    @TableField("spu_img")
    private String spuImg;

    /**
     * create_time
     */
    @TableField("create_time")
    private LocalDateTime createTime;
}
