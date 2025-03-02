package com.fzy.gulimall.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fzy.gulimall.member.bean.Member;
import com.fzy.gulimall.member.mapper.MemberMapper;
import com.fzy.gulimall.member.service.MemberService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员 服务实现类
 * </p>
 *
 * @author fzy
 * @since 2025-03-01
 */
@Service
public class MemberServiceImp extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
