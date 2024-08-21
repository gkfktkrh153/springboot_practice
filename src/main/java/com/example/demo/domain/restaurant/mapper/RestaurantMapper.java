package com.example.demo.domain.restaurant.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.restaurant.dto.RestaurantDetailResponse;
import com.example.demo.domain.restaurant.dto.RestaurantResponse;
import com.example.demo.domain.restaurant.entity.Restaurant;

@Mapper
public interface RestaurantMapper {
	List<RestaurantResponse> findAllRestaurant();
	RestaurantDetailResponse findRestaurantDetailById(int id);
	int saveRestaurant(Restaurant restaurant);
	int updateRestaurant(Restaurant restaurant);
}
