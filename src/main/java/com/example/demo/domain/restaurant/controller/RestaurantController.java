package com.example.demo.domain.restaurant.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.restaurant.dto.RestaurantCreateRequest;
import com.example.demo.domain.restaurant.dto.RestaurantDetailResponse;
import com.example.demo.domain.restaurant.dto.RestaurantResponse;
import com.example.demo.domain.restaurant.dto.RestaurantUpdateRequest;
import com.example.demo.domain.restaurant.entity.Restaurant;
import com.example.demo.domain.restaurant.service.RestaurantService;

import jakarta.validation.Valid;
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
	public ResponseEntity<Integer> createRestaurant(@Valid @RequestBody RestaurantCreateRequest createRequest){
		return ResponseEntity.ok(restaurantService.createRestaurant(createRequest));
	}
	
	@PutMapping("/restaurants/{restaurantId}")
	public ResponseEntity<Integer> updateRestaurant(@Valid  @RequestBody RestaurantUpdateRequest updateRequest, @PathVariable(value = "restaurantId") int restaurantId){
		return ResponseEntity.ok(restaurantService.updateRestaurant(updateRequest, restaurantId));
	}
	
	@DeleteMapping("/restaurants/{restaurantId}")
	public ResponseEntity<Integer> deleteRestaurant(@PathVariable(value = "restaurantId") int restaurantId){
		return ResponseEntity.ok(restaurantService.deleteRestaurant(restaurantId));
	}
	
	

}
