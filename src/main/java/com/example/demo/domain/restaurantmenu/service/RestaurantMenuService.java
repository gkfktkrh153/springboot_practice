package com.example.demo.domain.restaurantmenu.service;

import org.springframework.stereotype.Service;

import com.example.demo.domain.restaurantmenu.mapper.RestaurantMenuMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RestaurantMenuService {

	private final RestaurantMenuMapper restaurantMenuMapper;
	
	
}
