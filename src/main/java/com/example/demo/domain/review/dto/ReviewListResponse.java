package com.example.demo.domain.review.dto;

import java.util.List;
import java.util.OptionalDouble;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ReviewListResponse {

	private float avgScore;
	private List<ReviewDetail> reviews;
	
	@Builder
	public ReviewListResponse(float avgScore, List<ReviewDetail> reviews) {
		this.avgScore = avgScore;
		this.reviews = reviews;
	}
	
	
}
