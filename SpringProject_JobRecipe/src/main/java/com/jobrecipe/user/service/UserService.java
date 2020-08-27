package com.jobrecipe.user.service;

import com.jobrecipe.user.vo.UserVO;

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
	public void signupMember(UserVO userVO);
	
	public void searchAllCompany();
	
	public void followCompany();
	
	public void sendSignupMail();
	
	public void authEmailCheck();
}
