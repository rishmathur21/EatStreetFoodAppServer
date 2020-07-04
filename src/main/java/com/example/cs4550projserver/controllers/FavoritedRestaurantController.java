package com.example.cs4550projserver.controllers;

import com.example.cs4550projserver.models.FavoritedRestuarant;
import com.example.cs4550projserver.services.FavoritedRestaurantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class FavoritedRestaurantController {

    FavoritedRestaurantService service = new FavoritedRestaurantService();

    @PostMapping("/favorites")
    public int addFavoritedRestaurant(@RequestBody FavoritedRestuarant restaurant) {
        return service.addFavoritedRestaurant(restaurant);
    }

    @GetMapping("/favorites/{username}")
    public List<FavoritedRestuarant> getFavoritedRestaurantsForUser(@PathVariable("username") String username) {
        return service.getFavoritedRestaurantsForUser(username);
    }

    @DeleteMapping("favorites/{username}/{restaurantId}")
    public int deleteFavoritedRestaurant(@PathVariable("username") String username, @PathVariable("restaurantId") String restaurantId) {
        return service.deleteFavoritedRestaurant(username, restaurantId);
    }

}
