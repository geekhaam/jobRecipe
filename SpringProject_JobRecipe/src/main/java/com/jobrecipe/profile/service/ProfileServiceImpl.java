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
import com.jobrecipe.review.vo.ReviewVO;
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

	@Override
	public void drafts(UserVO vo) throws Exception {
		profileDAO.drafts1(vo);
		
	}

	@Override
	public void job_applicants(UserVO vo) throws Exception {
		profileDAO.job_applicants1(vo);
	}
	
	//내가 쓴 리뷰
	@Override
	public ArrayList<ReviewVO> getReview(int u_no) throws Exception {
		return profileDAO.getReview(u_no);
	}
	
	//이메일 수신체크
	@Override
	public void newsCheck(UserVO vo) throws Exception {
		profileDAO.newsCheck(vo);
	}
	
	//비밀번호 변경
	@Override
	public void pass_change(UserVO vo1) throws Exception {	
		profileDAO.pass_change(vo1);
	}
	//리뷰 업데이트
	@Override
	public void updateReview(ReviewVO vo1) {
		profileDAO.updateReview(vo1);
	}
	//리뷰 삭제
	@Override
	public void deleteReview(ReviewVO vo1) {
		profileDAO.deleteReview(vo1);
	}

	public String searchc(String rev_name) {
		
		return profileDAO.searchc(rev_name);
	}



}
