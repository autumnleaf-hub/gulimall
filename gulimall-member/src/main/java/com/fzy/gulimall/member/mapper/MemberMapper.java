package com.fzy.gulimall.member.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fzy.gulimall.member.bean.Member;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 会员 Mapper 接口
 * </p>
 *
 * @author fzy
 * @since 2025-03-01
 */
@Mapper
public interface MemberMapper extends BaseMapper<Member> {

}

