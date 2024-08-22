package com.example.demo.domain.review.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class CreateReviewRequest {

	private int restaurantId;
	private String content;
	private float score;
	
	
	public CreateReviewRequest(int restaurantId, String content, float score) {
		this.restaurantId = restaurantId;
		this.content = content;
		this.score = score;
	}
	
}
