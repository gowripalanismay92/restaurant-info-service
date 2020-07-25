package com.altimetrik.zomato.restaurantinfoservice.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.altimetrik.zomato.restaurantinfoservice.model.MenuItem;

@Repository
public interface MenuItemRepository extends PagingAndSortingRepository<MenuItem, String> {
	
	public List<MenuItem> findAllByRestaurantIdOrderByPriceAsc(@Param("restaurantId") String rid);

	public MenuItem findByName(@Param("name") String name);
}
