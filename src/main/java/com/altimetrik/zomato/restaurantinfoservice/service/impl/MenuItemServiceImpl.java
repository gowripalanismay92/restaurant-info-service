package com.altimetrik.zomato.restaurantinfoservice.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.altimetrik.zomato.restaurantinfoservice.model.MenuItem;
import com.altimetrik.zomato.restaurantinfoservice.repository.MenuItemRepository;
import com.altimetrik.zomato.restaurantinfoservice.service.MenuItemService;

@Service
public class MenuItemServiceImpl implements MenuItemService {
    private MenuItemRepository menuItemRepository;

    @Autowired
    public MenuItemServiceImpl(MenuItemRepository menuItemRepository) {
        this.menuItemRepository = menuItemRepository;
    }

    @Override
    public List<MenuItem> findAllByRestaurantId(String rid) {
        return menuItemRepository.findAllByRestaurantIdOrderByPriceAsc(rid);
    }

    @Override
    public void createMenuItem(MenuItem menuItem) {
        menuItemRepository.save(menuItem);
    }

    @Override
    public void uploadMenuItems(List<MenuItem> menuItems) {
        menuItemRepository.saveAll(menuItems);
    }
}
