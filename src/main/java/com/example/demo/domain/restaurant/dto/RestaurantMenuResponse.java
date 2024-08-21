package com.example.demo.domain.restaurant.dto;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class RestaurantMenuResponse {

	private int id;
	private String name;
	private int price;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy년 MM월 dd일 HH:mm:ss", timezone = "Asia/Seoul")
	private LocalDateTime createdAt;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy년 MM월 dd일 HH:mm:ss", timezone = "Asia/Seoul")
	private LocalDateTime updatedAt;
	
	
	@Builder
	public RestaurantMenuResponse(int id,String name, int price, LocalDateTime createdAt,
			LocalDateTime updatedAt) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	
	
}
