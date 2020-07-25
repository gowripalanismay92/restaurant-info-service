package com.altimetrik.zomato.restaurantinfoservice.service;

import java.util.List;

import com.altimetrik.zomato.restaurantinfoservice.model.Restaurant;

public interface RestaurantService {
    void createRestaurant(Restaurant restaurant);
    Restaurant getRestaurantByName(String name);
	List<Restaurant> getRestaurantByLocationAndArea(String location, String area);
}
