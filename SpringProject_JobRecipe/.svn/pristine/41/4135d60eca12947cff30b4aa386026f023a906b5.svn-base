package com.jobrecipe.advertisement.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobrecipe.advertisement.service.dao.AdvertisementDAO;
import com.jobrecipe.advertisement.vo.AdvertisementVO;
import com.jobrecipe.advertisement.vo.Paging;

@Service("advertisementService")
public class AdvertisementServiceImpl implements AdvertisementService{
	
	@Autowired
	private AdvertisementDAO dao;
	
	@Override
	@Transactional
	public ArrayList<AdvertisementVO> searchInfo() throws Exception { //寃��깋
		return dao.searchInfo();
	}


	@Override
	public ArrayList<AdvertisementVO> cInfo_Date(Paging pa) throws Exception { //留덇컧�씪�닚
		return dao.cInfo_Date(pa);
	}


	@Override
	public AdvertisementVO aAllInfo(AdvertisementVO vo) throws Exception { //湲곗뾽�젙蹂�
		// TODO Auto-generated method stub
		
		return dao.aAllInfo(vo);
	}


	@Override
	public AdvertisementVO aInfo(AdvertisementVO vo) throws Exception {
		// TODO Auto-generated method stub
		return dao.aInfo(vo);
	}


	@Override
	public ArrayList<AdvertisementVO> cInfo_Star(Paging pa) throws Exception {
		// TODO Auto-generated method stub
		return dao.cInfo_Star(pa);
	}


	@Override
	public AdvertisementVO dateOrderFirst() throws Exception {
		// TODO Auto-generated method stub
		return dao.dateOrderFirst();
	}


	@Override
	public AdvertisementVO starOrderFirst() throws Exception {
		// TODO Auto-generated method stub
		return dao.starOrderFirst();
	}


	@Override
	public int listCount() throws Exception {
		// TODO Auto-generated method stub
		return dao.listCount();
	}

}
