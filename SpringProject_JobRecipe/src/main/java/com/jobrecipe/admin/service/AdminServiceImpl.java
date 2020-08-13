package com.jobrecipe.admin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jobrecipe.admin.service.dao.AdminDAO;
import com.jobrecipe.admin.vo.CompanyVO;

@Service("adminService")
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	private AdminDAO admindao;

	@Override
	public CompanyVO selectCompanyOne(String c_name) {
		
		return this.admindao.selectCompanyOne(c_name);
	}

	@Override
	public void insertCompany(CompanyVO vo) {
		
		this.admindao.insertCompany(vo);
	}

	@Override
	public String selectCompanyName(String c_name) {
		
		return this.admindao.selectCompanyName(c_name);
	}

	@Override
	public void updateCompany(CompanyVO vo) {
		
		this.admindao.updateCompany(vo);
	}

	@Override
	public void deleteCompany(String c_name) {
		
		this.admindao.deleteCompany(c_name);
	}

}
