package com.example.demo.domain.review.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.review.dto.ReviewDetail;
import com.example.demo.domain.review.entity.Review;

@Mapper
public interface ReviewMapper {
	int saveReview(Review review);
	int deleteReview(int reviewId);
	 List<ReviewDetail> findReviewDetailListByRestaurantId(int restaurantId);

}
