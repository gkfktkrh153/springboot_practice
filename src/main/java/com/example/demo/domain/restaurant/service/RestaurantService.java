package com.example.demo.domain.restaurant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.restaurant.dto.RestaurantCreateRequest;
import com.example.demo.domain.restaurant.dto.RestaurantDetailResponse;
import com.example.demo.domain.restaurant.dto.RestaurantResponse;
import com.example.demo.domain.restaurant.entity.Restaurant;
import com.example.demo.domain.restaurant.mapper.RestaurantMapper;
import com.example.demo.domain.restaurantmenu.dto.RestaurantMenuCreateRequest;
import com.example.demo.domain.restaurantmenu.entity.RestaurantMenu;
import com.example.demo.domain.restaurantmenu.mapper.RestaurantMenuMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RestaurantService {

	private final RestaurantMapper restaurantMapper;
	private final RestaurantMenuMapper restaurantMenuMapper;
	
	
	public List<RestaurantResponse> findAllRestaurant(){
		return restaurantMapper.findAllRestaurant();
	}
	
	public RestaurantDetailResponse findRestaurantDetailById(int id) {
		return restaurantMapper.findRestaurantDetailById(id);
	}

	public int createRestaurant(RestaurantCreateRequest createRequest) {
		
		Restaurant restaurant = Restaurant.builder()
		.name(createRequest.getName())
		.address(createRequest.getAddress())
		.build();
		
		int result = restaurantMapper.saveRestaurant(restaurant);
		
		if(result != 1)
			System.out.println("restaurant 데이터 삽입 실패");
		
		List<RestaurantMenuCreateRequest> menuRequests = createRequest.getMenus();
		
		for(RestaurantMenuCreateRequest menuRequest : menuRequests) {
			
			RestaurantMenu restaurantMenu = RestaurantMenu.builder()
			.restaurantId(restaurant.getId())
			.name(menuRequest.getName())
			.price(menuRequest.getPrice())
			.build();
			
			restaurantMenuMapper.saveRestaurantMenu(restaurantMenu);			
		}

		
		return result;
	}
}
