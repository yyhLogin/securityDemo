package com.web.controller;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.util.Result;
import com.util.ResultUtil;
import com.web.entity.SysUser;
import com.web.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yyh
 * @since 2017-12-01
 */
@RestController
@RequestMapping("/sysUser")
public class SysUserController {

	@Autowired
	private SysUserService sysUserService;

	@GetMapping
	public Result query(){
		EntityWrapper<SysUser> ew = new EntityWrapper<>();
		return ResultUtil.success(sysUserService.selectList(ew));
	}


}

