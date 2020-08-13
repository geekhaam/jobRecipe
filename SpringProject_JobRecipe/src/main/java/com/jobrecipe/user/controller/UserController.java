package com.jobrecipe.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	/*
	 *** 로그인 및 비밀번호 찾기 ***
	 */
	
	//로그인 페이지로 이동
	@RequestMapping(value = "sign_in.do")
	public String signinForm() {
		return "users/sign_in";
	}
	
	/* 
	 * 로그인 버튼 눌렀을시 아이디, 비밀번호 체크
	 * 성공시 main.do로 이동, 실패시 js로 실패 이유를 메시지로 안내
	 */
	@RequestMapping(value = "signinCheck.do")
	public String signinCheck() {
		return "main";
	}
	
	//비밀번호 찾기 페이지로 이동
	@RequestMapping(value = "findPw.do")
	public String newPwForm() {
		return "users/password/new";
	}
	
	/*
	 * 비밀번호 찾기 페이지에서 이메일 입력 후 비밀번호 찾기 버튼 눌렀을시
	 * 성공하면 메일을 보낸 후 로그인 페이지로 이동, 실패하면 js로 실패 메시지 안내
	 */
	@RequestMapping(value = "sendNewPwMail.do")
	public String sendNewPwMail() {
		return "users/sign_in";
	}
	
	/* 
	 * 회원의 이메일로 보내진 새 비밀번호 설정 페이지의 링크를 눌렀을시 아래 메소드를 통해 이동
	 * 유저 구분을 위해 토큰 필요
	 */
	@RequestMapping(value = "editPw.do")
	public String editPwForm() {
		return "users/password/edit";
	}
	
	/*
	 * 새 비밀번호 설정 페이지에서 성공했을시 성공하면 로그인된 상태로 메인페이지로 넘어간다.
	 * 실패시 js로 실패 메시지 안내
	 */
	@RequestMapping(value = "setNewPw.do")
	public String setNewPw() {
		return "main";
	}
	
	
	/*
	 *** 회원가입 ***
	 */
	
	//회원가입 버튼을 누르면 회원가입 페이지로 이동
	@RequestMapping(value = "sign_up.do")
	public String signUpForm() {
		return "users/signup";
	}
	
	/* 
	 * 회원가입 메인에서 다음을 누르면 설문조사 페이지로 이동하며,
	 * red_users 테이블에 회원 정보 저장
	 * 다음 프로필 정보 입력 관련 페이지는 ProfileController에서 처리
	 */
	@RequestMapping(value = "signupMember.do")
	public String signupMember() {
		return "wizard/signup_questionnaire";
	}
	
	/*
	 * 회원가입 완료 버튼 누르면, UserService에서 sendSignupMail()를 통해 회원의 이메일로
	 * 인증 메일을 보내며, 메일 보내기 성공시 메인 페이지로 이동
	 */
	@RequestMapping(value = "completeSignup.do")
	public String completeSignup() {
		return "main";
	}
	
	//

	/*
	 * 이메일 인증에 성공하면 로그인이 된 상태로 메인 페이지로 넘어간다.
	 * 실패시 js로 실패 메시지 안내
	 * 유저 구분을 위해 토큰 필요
	 */
	@RequestMapping(value = "authEmail.do")
	public String authEmail() {
		return "main";
	}
}
