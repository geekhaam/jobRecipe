package com.jobrecipe.profile.vo;

import java.sql.Date;

public class ResumeVO {
	private int res_no;
	private int u_no;
	private int pro_no;
	private String res_title;
	private String edu_nos;
	private String car_nos;
	private String act_nos;
	private String cer_nos;
	private Date write_date;
	
	public ResumeVO() {
		// TODO Auto-generated constructor stub
	}

	public ResumeVO(int res_no, int u_no, int pro_no, String res_title,String edu_nos, String car_nos, String act_nos, String cer_nos,
			Date write_date) {
		super();
		this.res_no = res_no;
		this.u_no = u_no;
		this.pro_no = pro_no;
		this.res_title = res_title;
		this.edu_nos = edu_nos;
		this.car_nos = car_nos;
		this.act_nos = act_nos;
		this.cer_nos = cer_nos;
		this.write_date = write_date;
	}

	public int getRes_no() {
		return res_no;
	}
	public void setRes_no(int res_no) {
		this.res_no = res_no;
	}
	public int getU_no() {
		return u_no;
	}
	public void setU_no(int u_no) {
		this.u_no = u_no;
	}
	public int getPro_no() {
		return pro_no;
	}
	public void setPro_no(int pro_no) {
		this.pro_no = pro_no;
	}
	public String getRes_title() {
		return res_title;
	}
	public void setRes_title(String res_title) {
		this.res_title = res_title;
	}
	public String getEdu_nos() {
		return edu_nos;
	}
	public void setEdu_nos(String edu_nos) {
		this.edu_nos = edu_nos;
	}
	public String getCar_nos() {
		return car_nos;
	}
	public void setCar_nos(String car_nos) {
		this.car_nos = car_nos;
	}
	public String getAct_nos() {
		return act_nos;
	}
	public void setAct_nos(String act_nos) {
		this.act_nos = act_nos;
	}
	public String getCer_nos() {
		return cer_nos;
	}
	public void setCer_nos(String cer_nos) {
		this.cer_nos = cer_nos;
	}
	public Date getWrite_date() {
		return write_date;
	}
	public void setWrite_date(Date write_date) {
		this.write_date = write_date;
	}

	@Override
	public String toString() {
		return "ResumeVO [res_no=" + res_no + ", u_no=" + u_no + ", pro_no=" + pro_no +", res_title=" + res_title
				+  ", edu_nos=" + edu_nos + ", car_nos=" + car_nos + ", act_nos=" + act_nos + ", cer_nos=" + cer_nos
				+ ", write_date=" + write_date + "]";
	}
	
}