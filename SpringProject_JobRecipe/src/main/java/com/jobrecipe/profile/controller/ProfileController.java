package com.jobrecipe.profile.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {
	
	/* 
	 * 설문조사 페이지에서 다음을 누르면 팔로잉 기업 체크 페이지로 이동하며,
	 * rec_profile 테이블에 회원 기본 정보 저장
	 */
	@RequestMapping(value = "insertProfile.do")
	public String insertProfile() {
		return "wizard/signup_follow";
	}
}