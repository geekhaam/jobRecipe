package com.jobrecipe.review.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jobrecipe.review.service.dao.ReviewDAO;
import com.jobrecipe.review.vo.ReviewVO;

@Service("reviewService")
public class ReviewServiceimpl implements ReviewService{

	
	@Autowired
	private ReviewDAO reviewdao;
	
	@Override
	@Transactional
	
	public ArrayList <ReviewVO> getAllReview() throws Exception{
		return reviewdao.getAllReview();
	}
	
	public void insertReview(ReviewVO reviewVO) {
		reviewdao.insertReview(reviewVO);
	}
	
	public ReviewVO getReview(ReviewVO reviewVO) {
		return reviewdao.getReview(reviewVO);
	}
	
	
	
	
}
