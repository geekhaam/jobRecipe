package com.jobrecipe.company.vo;


import com.jobrecipe.advertisement.vo.AdvertisementVO;

public class CompanyVO {

	private String c_name; //회사이름
	private String c_loc; //회사위치
	private String c_addr; //회사주소
	private String c_star; //평점
	private AdvertisementVO advertisementVO;
	

	public CompanyVO() {
		
	}
	
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_loc() {
		return c_loc;
	}

	public void setC_loc(String c_loc) {
		this.c_loc = c_loc;
	}
	public String getC_addr() {
		return c_addr;
	}
	public void setC_addr(String c_addr) {
		this.c_addr = c_addr;
	}
	public String getC_star() {
		return c_star;
	}
	public void setC_star(String c_star) {
		this.c_star = c_star;
	}
	
	public AdvertisementVO getAdvertisementVO() {
		return advertisementVO;
	}

	public void setAdvertisementVO(AdvertisementVO advertisementVO) {
		this.advertisementVO = advertisementVO;
	}
	
	

	
}
