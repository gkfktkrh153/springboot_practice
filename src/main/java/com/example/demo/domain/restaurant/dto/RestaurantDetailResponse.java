package com.example.demo.domain.restaurant.dto;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RestaurantDetailResponse {
	private int id;
	private String name;
	private String address;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy년 MM월 dd일 HH:mm:ss", timezone = "Asia/Seoul")
	private LocalDateTime createdAt;
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy년 MM월 dd일 HH:mm:ss", timezone = "Asia/Seoul")
	private LocalDateTime updatedAt;
	private List<RestaurantMenuResponse> menus;
	
	public RestaurantDetailResponse(int id, String name, String address, LocalDateTime createdAt,
			LocalDateTime updatedAt, List<RestaurantMenuResponse> menus) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.menus = menus;
	}
	

	
	
}
