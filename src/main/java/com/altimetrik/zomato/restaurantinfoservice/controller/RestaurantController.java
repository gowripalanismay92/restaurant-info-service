package com.altimetrik.zomato.restaurantinfoservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.zomato.restaurantinfoservice.model.Restaurant;
import com.altimetrik.zomato.restaurantinfoservice.service.MenuItemService;
import com.altimetrik.zomato.restaurantinfoservice.service.RestaurantService;
import com.altimetrik.zomato.restaurantinfoservice.transport.GenericResponse;
import com.altimetrik.zomato.restaurantinfoservice.util.ResponseGenerator;
import com.altimetrik.zomato.restaurantinfoservice.util.RestaurantConstants;

import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/api")
public class RestaurantController {
	RestaurantService restaurantService;
	MenuItemService menuItemService;

	@Autowired
	public RestaurantController(RestaurantService restaurantService, MenuItemService menuItemService) {
		this.restaurantService = restaurantService;
		this.menuItemService = menuItemService;
	}

	// @ApiOperation(value = "Create Restaurant", tags = "createRestaurant")
	@RequestMapping(value = "/restaurants", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(value = HttpStatus.CREATED)
	public GenericResponse createRestaurant(
			@ApiParam(value = "Request body with restaurant data", required = true) @RequestBody Restaurant restaurant) {
		restaurantService.createRestaurant(restaurant);
		
		return ResponseGenerator.generateResponse(RestaurantConstants.SUCCESS);
	}

	// @ApiOperation(value = "Retrieve all the Restaurants by location", tags =
	// "findRestaurantByLocation")
	@RequestMapping(value = "/restaurants/location", method = RequestMethod.GET)
	public List<Restaurant> findRestaurantByLocationAndArea(@RequestParam(value = "location") String location, @RequestParam(value = "area") String area) {
		return restaurantService.getRestaurantByLocationAndArea(location, area);
	}

	/*
	 * @RequestMapping(value = "/restaurants", method = RequestMethod.GET) public
	 * Restaurant findRestaurant(@RequestParam(value = "name") String name) { return
	 * restaurantService.getRestaurantByName(name); }
	 */

}
