package com.example.demo.domain.review.entity;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Review {

	private int id;
	private int restaurantId;
	private String content;
	private double score;
	
	@Builder
	public Review(int id, int restaurantId, String content, double score) {
		this.id = id;
		this.restaurantId = restaurantId;
		this.content = content;
		this.score = score;
	}
	
	
}
