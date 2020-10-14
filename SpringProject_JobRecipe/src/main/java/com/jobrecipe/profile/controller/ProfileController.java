package com.jobrecipe.profile.controller;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jobrecipe.profile.service.ProfileServiceImpl;
import com.jobrecipe.profile.vo.ProfileVO;
import com.jobrecipe.user.service.UserServiceImpl;
import com.jobrecipe.user.vo.UserVO;

@Controller
public class ProfileController {

	@Resource(name = "ProfileService")
	private ProfileServiceImpl profileService;

	@Resource(name = "UserService")
	private UserServiceImpl userService;
	
	/*
	 * 마이페이지 링크
	 */
	@RequestMapping(value = "/settings.do")
	public String settingForm(UserVO userVO) {
		return "profile/settings";
	}
	
	/*
	 * 마이페이지 링크
	 */
	@RequestMapping(value = "/resumes.do")
	public String resumesForm(HttpSession session, Model model) {
		UserVO loginInfo = (UserVO) session.getAttribute("login");
		int u_no = loginInfo.getU_no();
		model.addAttribute("profileVO", profileService.getProfile(u_no));
		model.addAttribute("eduVOList", profileService.getEducation(u_no));
		model.addAttribute("carVOList", profileService.getCareer(u_no));
		model.addAttribute("actAwardVOList", profileService.getActAward(u_no));
		model.addAttribute("certiOtherVOList", profileService.getCertiOther(u_no));
		model.addAttribute("portVOList", profileService.getPortfolio(u_no));
		return "profile/resumes";
	}
	
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
	
	/*
	 * @RequestMapping(value = "/change_password") public String
	 * change_password(UserVO vo1) { return "profile/password"; }
	 */
	
	/*
	 * @RequestMapping(value = "/newsletter.do") public String newsletter(UserVO vo)
	 * { return "profile/newsletter"; }
	 */

}
