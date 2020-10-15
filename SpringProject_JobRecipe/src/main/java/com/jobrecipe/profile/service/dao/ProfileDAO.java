package com.jobrecipe.profile.service.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.jobrecipe.profile.vo.ActAwardVO;
import com.jobrecipe.profile.vo.CareerVO;
import com.jobrecipe.profile.vo.CertiOtherVO;
import com.jobrecipe.profile.vo.EducationVO;
import com.jobrecipe.profile.vo.PortfolioVO;
import com.jobrecipe.profile.vo.ProfileVO;
import com.jobrecipe.review.vo.ReviewVO;
import com.jobrecipe.user.vo.UserVO;

@Repository
public interface ProfileDAO {
	
	public void insertProfile(ProfileVO profileVO);
	
	public ProfileVO getProfile(int u_no);
	
	public ArrayList<EducationVO> getEducation(int u_no);
	
	public ArrayList<CareerVO> getCareer(int u_no);
	
	public ArrayList<ActAwardVO> getActAward(int u_no);
	
	public ArrayList<CertiOtherVO> getCertiOther(int u_no);
	
	public ArrayList<PortfolioVO> getPortfolio(int u_no);
	
	public void updateResume(int u_no);
	
	//작성중
	public void drafts1(UserVO vo);
	
	//팔로잉기업
	public void job_applicants1(UserVO vo);
	
	//이메일 수신 체크
	public void newsCheck(UserVO vo);
	
	//비밀번호 변경
	public void pass_change(UserVO vo1)throws Exception;
	
	//기업검색
	public String searchc(String rev_name);
	
	//내가 쓴 전체 리뷰
	public ArrayList<ReviewVO> getAllReview(int u_no) throws Exception;
	
	//내가 쓴 전체 리뷰 개수 확인
	public int getAllRevCount(int u_no) throws Exception;
	
	//특정 리뷰 불러오기
	public ReviewVO getReview(int rev_no);
	
	//리뷰 업데이트
	public void updateReview(ReviewVO vo1);
	
	//리뷰 삭제
	public void deleteReview(int rev_no);
	
	
}
