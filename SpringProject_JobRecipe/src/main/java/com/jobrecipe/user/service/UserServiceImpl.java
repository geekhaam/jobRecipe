package com.jobrecipe.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobrecipe.user.service.dao.UserDAO;
import com.jobrecipe.user.vo.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;
	
	/*
	 *** 로그인 및 비밀번호 찾기 관련 서비스 ***
	 */
	
	@Override
	@Transactional
	public void signinCheck() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendNewPwMail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNewPw() {
		// TODO Auto-generated method stub
		
	}
	
	
	/*
	 *** 회원가입 관련 서비스 ***
	 */

	@Override
	public void signupMember(UserVO userVO) {
		System.out.println("signupMember-service call");
		userDAO.insertMember(userVO);
	}

	@Override
	public void searchAllCompany() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void followCompany() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendSignupMail() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void authEmailCheck() {
		// TODO Auto-generated method stub
		
	}

}
