package com.jobrecipe.review.controller;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobrecipe.review.service.ReviewService;
import com.jobrecipe.review.vo.ReviewVO;

@Controller
@RequestMapping("/hire/*")
public class ReviewController {

	@Resource(name="reviewService")
	private ReviewService reviewService;
	
	private static final Logger logger = LoggerFactory.getLogger(ReviewController.class);
	
	
	@RequestMapping(value ="reviewAll.do")
	
	public String ReviewAll(Model model) throws Exception{
		ArrayList<ReviewVO> alist = reviewService.getAllReview();
		model.addAttribute("alist", alist);
		
		return "hire/reviews";
		
	}
	
	
}
