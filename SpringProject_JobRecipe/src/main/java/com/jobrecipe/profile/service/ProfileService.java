package com.jobrecipe.profile.service;

import java.util.ArrayList;

import com.jobrecipe.profile.vo.ActAwardVO;
import com.jobrecipe.profile.vo.CareerVO;
import com.jobrecipe.profile.vo.CertiOtherVO;
import com.jobrecipe.profile.vo.EducationVO;
import com.jobrecipe.profile.vo.PortfolioVO;
import com.jobrecipe.profile.vo.ProfileVO;
import com.jobrecipe.user.vo.UserVO;

public interface ProfileService {
	
	//회원가입시 프로필 등록
	public void insertProfile(ProfileVO profileVO);
	
	//기존의 기본 정보를 가지고 옴
	public ProfileVO getProfile(int u_no);
	
	//기존의 학력 사항 정보를 가지고 옴
	public ArrayList<EducationVO> getEducation(int u_no);
	
	//기존의 경력 사항 정보를 가지고 옴
	public ArrayList<CareerVO> getCareer(int u_no);
	
	//기존의 활동 및 수상내역 정보를 가지고 온다.
	public ArrayList<ActAwardVO> getActAward(int u_no);
	
	//기존의 자격증 및 기타내역 정보를 가지고 온다.
	public ArrayList<CertiOtherVO> getCertiOther(int u_no);
	
	//기존의 포트폴리오 정보를 가지고 온다.
	public ArrayList<PortfolioVO> getPortfolio(int u_no);
	
	//이력서에 정보 입력시 DB에 데이터를 보내줌 (ajax 고려)
	public void updateResume(int u_no);
	
	
}
