package com.example.demo.domain.review.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.review.dto.CreateReviewRequest;
import com.example.demo.domain.review.dto.ReviewListResponse;
import com.example.demo.domain.review.service.ReviewService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class ReviewController {

	private final ReviewService reviewService;
	
	@GetMapping("/restaurant/{restaurantId}/reviews")
	public ResponseEntity<ReviewListResponse> getReviewListByRestaurantId(@PathVariable(value = "restaurantId") int restaurantId){
		ReviewListResponse reviewListResponse = reviewService.getReviewList(restaurantId);
		return ResponseEntity.ok(reviewListResponse);
	}
	
	@PostMapping("/review")
	public ResponseEntity<Integer> createReview(@RequestBody CreateReviewRequest createReviewRequest){
		
		int result = reviewService.createReview(createReviewRequest);
		return ResponseEntity.ok(result);
	}
	
	@DeleteMapping("/review/{reviewId}")
	public ResponseEntity<Integer> deleteReview(@PathVariable(value = "reviewId") int reviewId){
		
		int result = reviewService.deleteReview(reviewId);
		return ResponseEntity.ok(result);
	}
}
