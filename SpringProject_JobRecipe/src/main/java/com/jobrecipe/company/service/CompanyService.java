package com.jobrecipe.company.service;

import java.util.ArrayList;
import java.util.List;

import com.jobrecipe.advertisement.vo.AdvertisementVO;
import com.jobrecipe.company.vo.CompanyVO;

public interface CompanyService {
	
	
	ArrayList<CompanyVO> cInfo_Star() throws Exception; //평점순
	
	CompanyVO cInfo(CompanyVO vo) throws Exception;

	ArrayList<CompanyVO> cInfo_Date() throws Exception;
	
}
