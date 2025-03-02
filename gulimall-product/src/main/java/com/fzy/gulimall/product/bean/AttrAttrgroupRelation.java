package com.fzy.gulimall.product.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
/**
 * <p>
 * 属性&属性分组关联
 * </p>
 *
 * @author fzy
 * @since 2025-03-02
 */
@Data
@TableName("pms_attr_attrgroup_relation")
public class AttrAttrgroupRelation implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 属性id
     */
    @TableField("attr_id")
    private Long attrId;

    /**
     * 属性分组id
     */
    @TableField("attr_group_id")
    private Long attrGroupId;

    /**
     * 属性组内排序
     */
    @TableField("attr_sort")
    private Integer attrSort;
}
