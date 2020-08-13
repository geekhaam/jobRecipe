package com.jobrecipe.admin.service.dao;

import org.springframework.stereotype.Repository;

import com.jobrecipe.admin.vo.CompanyVO;

@Repository
public interface AdminDAO {

	CompanyVO selectCompanyOne(String c_name);
	
	void insertCompany(CompanyVO vo);
	
	String selectCompanyName(String c_name);
	
	void updateCompany(CompanyVO vo);
	
	void deleteCompany(String c_name);

}
