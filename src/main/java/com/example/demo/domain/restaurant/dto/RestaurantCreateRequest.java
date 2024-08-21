package com.example.demo.domain.restaurant.dto;

import java.util.List;

import com.example.demo.domain.restaurantmenu.dto.RestaurantMenuCreateRequest;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class RestaurantCreateRequest {

	private String name;
	private String address;
	private List<RestaurantMenuCreateRequest> menus;

	
	@Builder
	public RestaurantCreateRequest(String name, String address, List<RestaurantMenuCreateRequest> menus) {
		this.name = name;
		this.address = address;
		this.menus = menus;
	}
	
	
}
