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
	
	//ȸ�����Խ� ������ ���
	public void insertProfile(ProfileVO profileVO);
	
	//������ �⺻ ������ ������ ��
	public ProfileVO getProfile(int u_no);
	
	//������ �з� ���� ������ ������ ��
	public ArrayList<EducationVO> getEducation(int u_no);
	
	//������ ��� ���� ������ ������ ��
	public ArrayList<CareerVO> getCareer(int u_no);
	
	//������ Ȱ�� �� ���󳻿� ������ ������ �´�.
	public ArrayList<ActAwardVO> getActAward(int u_no);
	
	//������ �ڰ��� �� ��Ÿ���� ������ ������ �´�.
	public ArrayList<CertiOtherVO> getCertiOther(int u_no);
	
	//������ ��Ʈ������ ������ ������ �´�.
	public ArrayList<PortfolioVO> getPortfolio(int u_no);
	
	//�̷¼��� ���� �Է½� DB�� �����͸� ������ (ajax ���)
	public void updateResume(int u_no);
	
	
}
