package com.example.demo.domain.restaurant.dto;

import java.util.List;

import com.example.demo.domain.restaurantmenu.dto.RestaurantMenuCreateRequest;

import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class RestaurantCreateRequest {

    @NotBlank(message = "맛집 이름은 필수입니다.")
	private String name;
    @NotBlank(message = "주소는 필수입니다.")
	private String address;
	private List<RestaurantMenuCreateRequest> menus;

	
	@Builder
	public RestaurantCreateRequest(String name, String address, List<RestaurantMenuCreateRequest> menus) {
		this.name = name;
		this.address = address;
		this.menus = menus;
	}
	
	
}
