package com.jobrecipe.profile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobrecipe.profile.service.dao.ProfileDAO;
import com.jobrecipe.profile.vo.ProfileVO;

@Service("profileService")
public class ProfileServiceImpl implements ProfileService {

	@Autowired
	private ProfileDAO profileDAO;
	
	@Override
	@Transactional
	public void insertProfile(ProfileVO profileVO) {
		profileDAO.insertProfile(profileVO);
		System.out.println("insertProfile-service call");
	}

}
