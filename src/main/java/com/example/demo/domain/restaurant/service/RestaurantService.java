package com.example.demo.domain.restaurant.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.domain.restaurant.dto.RestaurantDetailResponse;
import com.example.demo.domain.restaurant.dto.RestaurantResponse;
import com.example.demo.domain.restaurant.entity.Restaurant;
import com.example.demo.domain.restaurant.mapper.RestaurantMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RestaurantService {

	private final RestaurantMapper restaurantMapper;
	
	public List<RestaurantResponse> findAllRestaurant(){
		return restaurantMapper.findAllRestaurant();
	}
	
	public RestaurantDetailResponse findRestaurantDetailById(int id) {
		return restaurantMapper.findRestaurantDetailById(id);
	}

	public int createRestaurant(Restaurant restaurant) {
		return restaurantMapper.saveRestaurant(restaurant);
	}
}
