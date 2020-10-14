package com.jobrecipe.profile.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobrecipe.profile.service.dao.ProfileDAO;
import com.jobrecipe.profile.vo.ActAwardVO;
import com.jobrecipe.profile.vo.CareerVO;
import com.jobrecipe.profile.vo.CertiOtherVO;
import com.jobrecipe.profile.vo.EducationVO;
import com.jobrecipe.profile.vo.PortfolioVO;
import com.jobrecipe.profile.vo.ProfileVO;
import com.jobrecipe.user.vo.UserVO;

@Service("ProfileService")
public class ProfileServiceImpl implements ProfileService{

	@Autowired
	private ProfileDAO profileDAO;
	
	@Override
	public void insertProfile(ProfileVO profileVO) {
		profileDAO.insertProfile(profileVO);
		System.out.println("insertProfile-service call");
	}

	@Override
	public ProfileVO getProfile(int u_no) {
		System.out.println("getProfile-service call");
		return profileDAO.getProfile(u_no);
	}

	@Override
	public ArrayList<EducationVO> getEducation(int u_no) {
		System.out.println("getEducation-service call");
		return profileDAO.getEducation(u_no);
	}

	@Override
	public ArrayList<CareerVO> getCareer(int u_no) {
		System.out.println("getCareer-service call");
		return profileDAO.getCareer(u_no);
	}

	@Override
	public ArrayList<ActAwardVO> getActAward(int u_no) {
		System.out.println("getActAward-service call");
		return profileDAO.getActAward(u_no);
	}

	@Override
	public ArrayList<CertiOtherVO> getCertiOther(int u_no) {
		System.out.println("getCertiOther-service call");
		return profileDAO.getCertiOther(u_no);
	}

	@Override
	public ArrayList<PortfolioVO> getPortfolio(int u_no) {
		System.out.println("getPortfolio-service call");
		return profileDAO.getPortfolio(u_no);
	}

	@Override
	public void updateResume(int u_no) {
		System.out.println("updateResume-service call");
		profileDAO.updateResume(u_no);
	}
	
	
}