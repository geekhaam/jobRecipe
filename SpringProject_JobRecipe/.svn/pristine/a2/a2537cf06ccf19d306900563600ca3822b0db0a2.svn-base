package com.jobrecipe.profile.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jobrecipe.profile.service.ProfileServiceImpl;
import com.jobrecipe.profile.vo.ProfileVO;

@Controller
public class ProfileController {
	
	@Resource(name = "profileService")
	private ProfileServiceImpl profileService;
	
	/* 
	 * 설문조사 페이지에서 다음을 누르면 팔로잉 기업 체크 페이지로 이동하며,
	 * rec_profile 테이블에 회원 기본 정보 저장
	 */
	@RequestMapping(value = "insertProfile.do")
	public String insertProfile(ProfileVO profileVO, Model model) {
		profileService.insertProfile(profileVO);
		model.addAttribute("u_no", profileVO.getU_no());
		return "wizard/signup_follow";
	}
}	
