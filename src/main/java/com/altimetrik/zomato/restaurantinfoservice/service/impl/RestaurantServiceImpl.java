package com.altimetrik.zomato.restaurantinfoservice.service.impl;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrik.zomato.restaurantinfoservice.model.Restaurant;
import com.altimetrik.zomato.restaurantinfoservice.repository.RestaurantRepository;
import com.altimetrik.zomato.restaurantinfoservice.service.RestaurantService;

@Service
@Slf4j
public class RestaurantServiceImpl implements RestaurantService {
	private RestaurantRepository restaurantRepository;

	@Autowired
	public RestaurantServiceImpl(RestaurantRepository restaurantRepository) {
		this.restaurantRepository = restaurantRepository;
	}

	@Override
	public void createRestaurant(Restaurant restaurant) {
		restaurantRepository.save(restaurant);
	}

	@Override
	public Restaurant getRestaurantByName(String name) {
		Restaurant restaurant = restaurantRepository.findFirstByName(name);
		return restaurant;
	}

	@Override
	public List<Restaurant> getRestaurantByLocationAndArea(String location, String area) {
		List<Restaurant> restaurantList = restaurantRepository.findByLocationAndAreaOrderByRatingDesc(location, area);
		return restaurantList;
	}
}
