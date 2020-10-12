package com.jobrecipe.advertisement.service;

import java.util.ArrayList;

import com.jobrecipe.advertisement.vo.AdvertisementVO;
import com.jobrecipe.advertisement.vo.Paging;

public interface AdvertisementService {
	ArrayList<AdvertisementVO> searchInfo() throws Exception; //검색
	
	AdvertisementVO aAllInfo(AdvertisementVO vo) throws Exception; //회사정보
	
	ArrayList<AdvertisementVO> cInfo_Date(Paging pa) throws Exception; //마감일순
	
	AdvertisementVO aInfo(AdvertisementVO vo) throws Exception; //회사정보
	
	ArrayList<AdvertisementVO> cInfo_Star(Paging pa) throws Exception; //평점순
	
	AdvertisementVO dateOrderFirst() throws Exception;
	
	AdvertisementVO starOrderFirst() throws Exception;
	
	int listCount() throws Exception; //게시물 총 갯수
}
