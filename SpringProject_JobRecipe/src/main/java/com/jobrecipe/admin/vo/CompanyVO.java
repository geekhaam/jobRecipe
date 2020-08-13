package com.jobrecipe.admin.vo;

public class CompanyVO {
	
	private String c_name; //회사이름
	private String c_loc; //회사 대략적인 위치
	private String c_addr; //회사 상세 위치
	
	public CompanyVO() {}

	public CompanyVO(String c_name, String c_loc, String c_addr) {
		super();
		this.c_name = c_name;
		this.c_loc = c_loc;
		this.c_addr = c_addr;
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
	
	
}
