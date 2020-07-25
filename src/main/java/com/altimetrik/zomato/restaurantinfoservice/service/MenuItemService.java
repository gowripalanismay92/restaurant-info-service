package com.altimetrik.zomato.restaurantinfoservice.service;



import java.util.List;

import com.altimetrik.zomato.restaurantinfoservice.model.MenuItem;

public interface MenuItemService {
    List<MenuItem> findAllByRestaurantId(String rid);
    void createMenuItem(MenuItem menuItem);
    void uploadMenuItems(List<MenuItem> menuItems);
}
