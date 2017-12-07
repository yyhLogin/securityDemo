package com.web.security;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.web.entity.SysUser;
import com.web.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private SysUserService sysUserService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		EntityWrapper<SysUser> ew = new EntityWrapper<>();
		SysUser sysUsers = sysUserService.selectOne(ew.eq("username",username));
		return new User(sysUsers.getUsername(), sysUsers.getPassword(),
				AuthorityUtils.commaSeparatedStringToAuthorityList("admin"));
	}
}
