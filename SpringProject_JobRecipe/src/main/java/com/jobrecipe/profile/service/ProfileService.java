package com.jobrecipe.profile.service;

import com.jobrecipe.profile.vo.ProfileVO;

public interface ProfileService {
	
	/*
	 * 회원가입시 프로필 등록
	 */
	
	public void insertProfile(ProfileVO profileVO);
}
