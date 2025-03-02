package com.fzy.gulimall.member.bean;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
/**
 * <p>
 * 会员
 * </p>
 *
 * @author fzy
 * @since 2025-03-01
 */
@Getter
@Setter
@ToString
@TableName("ums_member")
public class Member implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 会员等级id
     */
    @TableField("level_id")
    private Long levelId;

    /**
     * 用户名
     */
    @TableField("username")
    private String username;

    /**
     * 密码
     */
    @TableField("password")
    private String password;

    /**
     * 昵称
     */
    @TableField("nickname")
    private String nickname;

    /**
     * 手机号码
     */
    @TableField("mobile")
    private String mobile;

    /**
     * 邮箱
     */
    @TableField("email")
    private String email;

    /**
     * 头像
     */
    @TableField("header")
    private String header;

    /**
     * 性别
     */
    @TableField("gender")
    private Integer gender;

    /**
     * 生日
     */
    @TableField("birth")
    private LocalDate birth;

    /**
     * 所在城市
     */
    @TableField("city")
    private String city;

    /**
     * 职业
     */
    @TableField("job")
    private String job;

    /**
     * 个性签名
     */
    @TableField("sign")
    private String sign;

    /**
     * 用户来源
     */
    @TableField("source_type")
    private Integer sourceType;

    /**
     * 积分
     */
    @TableField("integration")
    private Integer integration;

    /**
     * 成长值
     */
    @TableField("growth")
    private Integer growth;

    /**
     * 启用状态
     */
    @TableLogic
    @TableField("status")
    private Integer status;

    /**
     * 注册时间
     */
    @TableField("create_time")
    private LocalDateTime createTime;
}
