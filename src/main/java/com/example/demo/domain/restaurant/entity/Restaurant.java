package com.example.demo.domain.restaurant.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class Restaurant {
	private int id;
	private String name;
	private String address;
	
	@Builder
	public Restaurant(int id,String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	
	
}
