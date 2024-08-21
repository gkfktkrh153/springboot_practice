package com.example.demo.domain.restaurant.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.restaurant.dto.RestaurantCreateRequst;
import com.example.demo.domain.restaurant.dto.RestaurantDetailResponse;
import com.example.demo.domain.restaurant.dto.RestaurantResponse;
import com.example.demo.domain.restaurant.entity.Restaurant;
import com.example.demo.domain.restaurant.service.RestaurantService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class RestaurantController {

	private final RestaurantService restaurantService;
	
	@GetMapping("/restaurants")
	public ResponseEntity<List<RestaurantResponse>> findAllRestaurant(){
		 List<RestaurantResponse> restaurants = restaurantService.findAllRestaurant();
		 return ResponseEntity.ok(restaurants);
	}
	
	@GetMapping("/restaurants/{id}")
	public ResponseEntity<RestaurantDetailResponse> findRestaurantDetailById(@PathVariable(value = "id") int id)
	{
		RestaurantDetailResponse restaurantDetailById = restaurantService.findRestaurantDetailById(id);
		return ResponseEntity.ok(restaurantDetailById);
	}
	@PostMapping("/restaurants")
	public ResponseEntity<Void> createRestaurant(@RequestBody RestaurantCreateRequst createRequest){
		Restaurant restaurant = Restaurant.builder()
		.name(createRequest.getName())
		.address(createRequest.getAddress())
		.build();
		
		int result = restaurantService.createRestaurant(restaurant);
		
		if(result != 1)
			System.out.println("restaurant 데이터 삽입 실패");
		
		
		restaurant.getId();
		
		
		return null;
	}
	
	
	

}
