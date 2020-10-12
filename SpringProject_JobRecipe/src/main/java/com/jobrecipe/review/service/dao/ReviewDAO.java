package com.jobrecipe.review.service.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.jobrecipe.review.vo.ReviewVO;

@Repository
public interface ReviewDAO {


	ArrayList <ReviewVO>getAllReview() throws Exception;
	void insertReview(ReviewVO reviewVO);
	ReviewVO getReview(ReviewVO reviewVO);
	
	
	
	
}
