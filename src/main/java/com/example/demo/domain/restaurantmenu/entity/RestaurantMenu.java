package com.example.demo.domain.restaurantmenu.entity;

import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class RestaurantMenu {
	private int restaurantId;
	private String name;
	private int price;

	
	
	@Builder
	public RestaurantMenu(int restaurantId,String name, int price) {
		this.restaurantId = restaurantId;
		this.name = name;
		this.price = price;
	}
}
