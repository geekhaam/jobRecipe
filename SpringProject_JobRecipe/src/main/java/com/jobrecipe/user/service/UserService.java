package com.jobrecipe.user.service;

import org.springframework.stereotype.Service;

@Service("userService")
public interface UserService {
	/*
	 *** 로그인 및 비밀번호 찾기 관련 서비스 ***
	 */
	public void signinCheck();
	
	public void sendNewPwMail();
	
	public void setNewPw();
	
	/*
	 *** 회원가입 관련 서비스 ***
	 */
	public void signupMember();
	
	public void searchAllCompany();
	
	public void followCompany();
	
	public void sendSignupMail();
	
	public void authEmailCheck();
}