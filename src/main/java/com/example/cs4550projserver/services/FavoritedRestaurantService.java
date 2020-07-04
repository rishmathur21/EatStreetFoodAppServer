package com.example.cs4550projserver.services;

import com.example.cs4550projserver.models.FavoritedRestuarant;

import java.util.ArrayList;
import java.util.List;

public class FavoritedRestaurantService {

    List<FavoritedRestuarant> favoritedRestuarantList = new ArrayList<FavoritedRestuarant>();

    public int addFavoritedRestaurant(FavoritedRestuarant newRestaurant) {
        for (FavoritedRestuarant restaurant : favoritedRestuarantList) {
            if (restaurant.getUsername().equals(newRestaurant.getUsername()) && restaurant.getRestaurantId().equals(newRestaurant.getRestaurantId())) {
                return 0;
            }
        }
        favoritedRestuarantList.add(newRestaurant);
        return 1;
    }

    public List<FavoritedRestuarant> getFavoritedRestaurantsForUser(String username) {
        List<FavoritedRestuarant> favorites = new ArrayList<>();

        for (FavoritedRestuarant restaurant : favoritedRestuarantList) {
            if (restaurant.getUsername().equals(username)) {
                favorites.add(restaurant);
            }
        }
        return favorites;
    }

    public int deleteFavoritedRestaurant(String username, String restaurantId) {
        for (int i = 0; i < favoritedRestuarantList.size(); i++) {
            FavoritedRestuarant restaurant = favoritedRestuarantList.get(i);
            if (restaurant.getUsername().equals(username) && restaurant.getRestaurantId().equals(restaurantId)) {
                favoritedRestuarantList.remove(i);
                return 1;
            }
        }
        return 1;
    }

}
