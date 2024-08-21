package com.example.demo.domain.restaurantmenu.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.restaurantmenu.entity.RestaurantMenu;

@Mapper
public interface RestaurantMenuMapper {
	void saveRestaurantMenu(RestaurantMenu restaurantMenu);
	void deleteRestaurantMenu(int restaurantId);
}
