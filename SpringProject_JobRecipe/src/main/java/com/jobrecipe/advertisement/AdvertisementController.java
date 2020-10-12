package com.jobrecipe.advertisement;

import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jobrecipe.advertisement.service.AdvertisementService;
import com.jobrecipe.advertisement.vo.AdvertisementVO;
import com.jobrecipe.advertisement.vo.Paging;
import com.jobrecipe.advertisement.vo.PageMaker;

@Controller
@RequestMapping("/hire/*")
public class AdvertisementController {

	@Resource(name = "advertisementService")
	private AdvertisementService advertisementService;

	@RequestMapping(value = "/Search_Job.do" ) // 野껓옙占쎄퉳野껉퀗�궢
	public String Search(Model model) throws Exception {
		ArrayList<AdvertisementVO> list = advertisementService.searchInfo();
		model.addAttribute("list", list);
		return "hire/Search_Job";
	}
	
	@RequestMapping (value = "/aAllInfo.do"  ) //疫꿸퀣毓쏙옙�젟癰귨옙 
	public String InfoList(AdvertisementVO vo, Model model,HttpServletRequest request,Paging cri) throws Exception {	
		
		
		AdvertisementVO imsi = advertisementService.aAllInfo(vo); 
		model.addAttribute("imsi",imsi); 
		
		
		model.addAttribute("info",advertisementService.cInfo_Date(cri));
		
		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(cri);
		pageMaker.setTotalCount(advertisementService.listCount());
		
		
		
		model.addAttribute("pageMaker",pageMaker);
	
		return "hire/CompanyInfo"; 
	}
	
	@RequestMapping (value = "/aAllInfo1.do"  ) //疫꿸퀣毓쏙옙�젟癰귨옙 
	public String InfoList1(AdvertisementVO vo, Model model,HttpServletRequest request,Paging pa) throws Exception {	
		model.addAttribute("info",advertisementService.cInfo_Date(pa));

		PageMaker pageMaker = new PageMaker();
		pageMaker.setCri(pa);
		pageMaker.setTotalCount(advertisementService.listCount());
		
		model.addAttribute("pageMaker",pageMaker);
	
		
		return "hire/CompanyInfo1"; 
	}
	


	@RequestMapping(value= "/aInfo.do" ) //疫꿸퀣毓쏙옙�젟癰귨옙
	public String Info1(AdvertisementVO vo, Model model) throws Exception {
		AdvertisementVO imsi = advertisementService.aInfo(vo);
		model.addAttribute("imsi",imsi); 
		return "hire/CompanyInfo"; 
	}
	
	@RequestMapping(value="/aOrderInfo.do")
	public String OrderInfo(String order, Model model,Paging pa) throws Exception {
		ArrayList<AdvertisementVO> info;
		if(order.equals("평점수"))
			info = advertisementService.cInfo_Star(pa);
		else 
			info = advertisementService.cInfo_Date(pa);
		model.addAttribute("info", info);
		return "hire/CompanyInfo";
	}
	
	
	

}
