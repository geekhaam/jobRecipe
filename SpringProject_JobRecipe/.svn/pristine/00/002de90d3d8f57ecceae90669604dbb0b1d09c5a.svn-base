package com.jobrecipe.advertisement.service.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.jobrecipe.advertisement.vo.AdvertisementVO;
import com.jobrecipe.advertisement.vo.Paging;

@Repository
public interface AdvertisementDAO {
	ArrayList<AdvertisementVO> searchInfo() throws Exception; //출력
	
	AdvertisementVO aAllInfo(AdvertisementVO vo) throws Exception; //�쉶�궗�젙蹂�
		
	ArrayList<AdvertisementVO> cInfo_Date(Paging pa) throws Exception; //조회순
	
	AdvertisementVO aInfo(AdvertisementVO vo) throws Exception;
	
	ArrayList<AdvertisementVO> cInfo_Star(Paging pa) throws Exception; //평점순
	
	AdvertisementVO dateOrderFirst() throws Exception; //留덇컧�씪�닚 泥ル쾲吏�
	
	AdvertisementVO starOrderFirst() throws Exception; //�룊�젏�닚 泥ル쾲吏�
	
	int listCount() throws Exception;

}
