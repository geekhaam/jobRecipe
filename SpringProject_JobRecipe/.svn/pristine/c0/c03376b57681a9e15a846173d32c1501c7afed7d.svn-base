package com.jobrecipe.company.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobrecipe.advertisement.vo.AdvertisementVO;
import com.jobrecipe.company.service.dao.CompanyDAO;
import com.jobrecipe.company.vo.CompanyVO;

@Service("companyService")
public class CompanyServiceImpl implements CompanyService{

	@Autowired
	private CompanyDAO dao;
	
	@Transactional
	@Override
	public ArrayList<CompanyVO> cInfo_Star() throws Exception {
		return dao.cInfo_Star();
	}

	@Override
	public CompanyVO cInfo(CompanyVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dao.cInfo(vo);
	}

	@Override
	public ArrayList<CompanyVO> cInfo_Date() throws Exception {
		// TODO Auto-generated method stub
		return dao.cInfo_Date();
	}
	
	

}
