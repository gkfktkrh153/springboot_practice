package com.example.demo.domain.restaurantmenu.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class RestaurantMenuCreateRequest {

	private String name;
	private int price;
	
	
	@Builder
	public RestaurantMenuCreateRequest(String name, int price) {
		this.name = name;
		this.price = price;
	}

	
}
