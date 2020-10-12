package com.jobrecipe.company;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jobrecipe.company.service.CompanyService;
import com.jobrecipe.company.vo.CompanyVO;

@Controller
@RequestMapping("/hire/*")
public class CompanyController {

	@Resource(name="companyService")
	private CompanyService companyService;
	
	/*
	@RequestMapping(value="/cInfo_Date.do") //마감일순
	public String cInfo_Date(CompanyVO vo,Model model) throws Exception {
		ArrayList<CompanyVO> list = companyService.cInfo_Date();
		model.addAttribute("list",list);
		return "hire/CompanyInfo1";
	}
	
	@RequestMapping(value="/cInfo_Star.do")//평점순
	public String cInfo_Star(CompanyVO vo,Model model) throws Exception {
		ArrayList<CompanyVO> list = companyService.cInfo_Star();
		model.addAttribute("list",list);
		return "hire/CompanyInfo1";
	}
	
	@RequestMapping(value="/cInfo.do")//회사정보
	public String cInfo(CompanyVO vo , Model model) throws Exception  {
		CompanyVO imsi = companyService.cInfo(vo);
		model.addAttribute("imsi",imsi);
		return "hire/CompanyInfo2";
	}*/
}
