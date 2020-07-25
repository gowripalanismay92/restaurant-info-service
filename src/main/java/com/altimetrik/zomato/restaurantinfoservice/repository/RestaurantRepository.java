package com.altimetrik.zomato.restaurantinfoservice.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.altimetrik.zomato.restaurantinfoservice.model.Restaurant;

@Repository
public interface RestaurantRepository extends PagingAndSortingRepository<Restaurant, String> {
    public Restaurant findFirstByName(@Param("name") String name);

	public List<Restaurant> findByLocationAndAreaOrderByRatingDesc(String location, String area);
}
