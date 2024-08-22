package com.example.demo.domain.review.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.review.dto.CreateReviewRequest;
import com.example.demo.domain.review.dto.ReviewDetail;
import com.example.demo.domain.review.dto.ReviewListResponse;
import com.example.demo.domain.review.entity.Review;
import com.example.demo.domain.review.mapper.ReviewMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ReviewService {
	
	private final ReviewMapper reviewMapper;
	
	
	public int createReview(CreateReviewRequest createReviewRequest) {
		Review review = Review.builder()
		.restaurantId(createReviewRequest.getRestaurantId())
		.content(createReviewRequest.getContent())
		.score(createReviewRequest.getScore())
		.build();
		
		return reviewMapper.saveReview(review);
		
	};
	
	public int deleteReview(int reviewId) {
		return reviewMapper.deleteReview(reviewId);
	}
	
	public ReviewListResponse getReviewList(int restaurantId) {
		
		List<ReviewDetail> reviews = reviewMapper.findReviewDetailListByRestaurantId(restaurantId);
		
		ReviewListResponse reviewListResponse = ReviewListResponse.builder()
		.reviews(reviews)
		.avgScore((float) reviews.stream().mapToDouble(r -> r.getScore()).average().getAsDouble())
		.build();
		
		return reviewListResponse;
	}
}
