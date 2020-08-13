package com.jobrecipe.admin;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jobrecipe.admin.service.AdminService;
import com.jobrecipe.admin.vo.CompanyVO;

@RequestMapping("/admin/*")
@Controller
public class AdminController {
	
	@Resource(name="adminService")
	private AdminService adminService;
	
	@RequestMapping(value="/insertCompanyForm.do")
	public String insertCompanyForm() { //관리자 페이지로 이동
		return "admin/insert_company";
	}
	
	@RequestMapping(value="/selectCompany.do")
	public String selectCompany(String c_name, Model m) { //회사명 검색
		CompanyVO vo = adminService.selectCompanyOne(c_name);
		
		m.addAttribute("vo", vo);
		return "admin/insert_company";
	}
	
	@RequestMapping(value="/insertCompany.do")
	public @ResponseBody String insertCompany(CompanyVO vo) { //회사 추가
		String aa = "yes"; //회사명 존재하는지 한번 더 확인 여부
		String cName = adminService.selectCompanyName(vo.getC_name());
	
		if(cName == null)
			adminService.insertCompany(vo);
		else if(vo.getC_name().equals(cName))
			aa = "no";
		return aa;
	}
	
	@RequestMapping(value="/updateCompany.do")
	public String updateCompany(CompanyVO vo) {
		adminService.updateCompany(vo);
		
		return "admin/insert_company";
	}
	
	@RequestMapping(value="/deleteCompany.do")
	public String deleteCompany(String c_name) {
		adminService.deleteCompany(c_name);
		
		return "admin/insert_company";
	}
	
	@RequestMapping(value="/insertAdvertiseForm.do")
	public String insertAdvertiseForm(CompanyVO vo, Model m) {
		m.addAttribute("c_name", vo.getC_name());
		m.addAttribute("c_loc", vo.getC_loc());
		m.addAttribute("c_addr", vo.getC_addr());
		
		return "admin/insert_advertise";
	}
	


}
