package com.web.properties;

public class BrowserProperties {

	private String signUpUrl = "/imooc-signUp.html";

	private String loginPage = SecurityConstants.DEFAULT_LOGIN_PAGE_URL;

	private LoginResponseType loginType = LoginResponseType.JSON;

	public String getSignUpUrl() {
		return signUpUrl;
	}

	public void setSignUpUrl(String signUpUrl) {
		this.signUpUrl = signUpUrl;
	}

	public String getLoginPage() {
		return loginPage;
	}

	public void setLoginPage(String loginPage) {
		this.loginPage = loginPage;
	}

	public LoginResponseType getLoginType() {
		return loginType;
	}

	public void setLoginType(LoginResponseType loginType) {
		this.loginType = loginType;
	}
}
