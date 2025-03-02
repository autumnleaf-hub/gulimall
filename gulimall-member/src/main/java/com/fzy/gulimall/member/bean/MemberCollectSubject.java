package com.fzy.gulimall.member.bean;

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
 * 会员收藏的专题活动
 * </p>
 *
 * @author fzy
 * @since 2025-03-01
 */
@Getter
@Setter
@ToString
@TableName("ums_member_collect_subject")
public class MemberCollectSubject implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * subject_id
     */
    @TableField("subject_id")
    private Long subjectId;

    /**
     * subject_name
     */
    @TableField("subject_name")
    private String subjectName;

    /**
     * subject_img
     */
    @TableField("subject_img")
    private String subjectImg;

    /**
     * 活动url
     */
    @TableField("subject_urll")
    private String subjectUrll;
}
