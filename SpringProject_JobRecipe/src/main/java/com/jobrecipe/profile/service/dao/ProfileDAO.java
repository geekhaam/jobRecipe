package com.jobrecipe.profile.service.dao;

import org.springframework.stereotype.Repository;

import com.jobrecipe.profile.vo.ProfileVO;

@Repository
public interface ProfileDAO {
	
	public void insertProfile(ProfileVO profileVO);
}
