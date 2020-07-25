package com.altimetrik.zomato.restaurantinfoservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.zomato.restaurantinfoservice.model.MenuItem;
import com.altimetrik.zomato.restaurantinfoservice.service.MenuItemService;

@RestController
@RequestMapping("/api")
public class MenuItemController {
   
	@Autowired
	MenuItemService menuItemService;

	@RequestMapping(value = "/restaurants/bulk/menuItems", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public void upload(@RequestBody List<MenuItem> menuItems) {
        this.menuItemService.uploadMenuItems(menuItems);
    }
	
	@RequestMapping(value = "/restaurants/{rid}/menuItems", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public void createMenuItem(@RequestBody MenuItem menuItem) {
        menuItemService.createMenuItem(menuItem);
    }
	
    @RequestMapping(value = "/restaurants/{rid}/menuItems", method = RequestMethod.GET)
    public List<MenuItem> getMenuItems(@PathVariable String rid) {
        return menuItemService.findAllByRestaurantId(rid);
    }

    

    
}
