package com.fzy.gulimall.member.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fzy.gulimall.member.bean.MemberLoginLog;
import com.fzy.gulimall.member.mapper.MemberLoginLogMapper;
import com.fzy.gulimall.member.service.MemberLoginLogService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 会员登录记录 服务实现类
 * </p>
 *
 * @author fzy
 * @since 2025-03-01
 */
@Service
public class MemberLoginLogServiceImp extends ServiceImpl<MemberLoginLogMapper, MemberLoginLog> implements MemberLoginLogService {

}
