package com.web.config;

import com.authentication.YIXGAuthenticationSuccessHandler;
import com.web.properties.SecurityProperties;
import com.web.security.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Bean
	@Override
	protected AuthenticationManager authenticationManager() throws Exception {
		return super.authenticationManager();
	}

	@Autowired
	private YIXGAuthenticationSuccessHandler yixgAuthenticationSuccessHandler;

	@Autowired
	private SecurityProperties securityProperties;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.formLogin()
				.usernameParameter("uname")
				.passwordParameter("upassword")
				.loginPage("/authentication/require")
				.loginProcessingUrl("/login")
				.successHandler(yixgAuthenticationSuccessHandler).permitAll()
				.and()
				.authorizeRequests()
				.antMatchers("/sysUser").hasRole("admin")
				.antMatchers("/authentication/require",
						securityProperties.getBrowser().getLoginPage()).permitAll()
				.anyRequest()
				.authenticated()
				.and()
				.csrf().disable();
	}


	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(myUserDetailsService()).passwordEncoder(passwordEncoder());
	}

	/**
	 * 设置用户密码的加密方式为MD5加密
	 * @return
	 */
	@Bean
	public Md5PasswordEncoder passwordEncoder() {
		return new Md5PasswordEncoder();

	}

	/**
	 * 自定义UserDetailsService，从数据库中读取用户信息
	 * @return
	 */
	@Bean
	public MyUserDetailsService myUserDetailsService(){
		return new MyUserDetailsService();
	}
}
