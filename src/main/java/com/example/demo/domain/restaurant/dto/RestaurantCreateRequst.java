package com.example.demo.domain.restaurant.dto;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class RestaurantCreateRequst {

	private String name;
	private String address;
	private List<Menu> menus;

	@NoArgsConstructor
	@Getter
	static class Menu{
		private String name;
		private int price;
	}

	
	@Builder
	public RestaurantCreateRequst(String name, String address, List<Menu> menus) {
		this.name = name;
		this.address = address;
		this.menus = menus;
	}
	
	
}
