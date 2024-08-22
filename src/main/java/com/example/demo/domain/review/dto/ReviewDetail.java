package com.example.demo.domain.review.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class ReviewDetail {

	private int id;
	private String content;
	private float score;
	private int restaurantId;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy년 MM월 dd일 HH:mm:ss", timezone = "Asia/Seoul")
	private LocalDateTime createdAt;
	
	@Builder
	public ReviewDetail(int id, String content, float score, int restaurantId, LocalDateTime createdAt) {
		this.id = id;
		this.content = content;
		this.score = score;
		this.restaurantId = restaurantId;
		this.createdAt = createdAt;
	}
	
	

}
