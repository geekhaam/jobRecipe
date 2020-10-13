package com.jobrecipe.profile.service.dao;

import org.springframework.stereotype.Repository;

import com.jobrecipe.profile.vo.ActAwardVO;
import com.jobrecipe.profile.vo.CareerVO;
import com.jobrecipe.profile.vo.CertiOtherVO;
import com.jobrecipe.profile.vo.EducationVO;
import com.jobrecipe.profile.vo.PortfolioVO;
import com.jobrecipe.profile.vo.ProfileVO;

@Repository
public interface ProfileDAO {
	
	public void insertProfile(ProfileVO profileVO);
	
	public ProfileVO getProfile(int u_no);
	
	public EducationVO getEducation(int u_no);
	
	public CareerVO getCareer(int u_no);
	
	public ActAwardVO getActAward(int u_no);
	
	public CertiOtherVO getCertiOther(int u_no);
	
	public PortfolioVO getPortfolio(int u_no);
}
