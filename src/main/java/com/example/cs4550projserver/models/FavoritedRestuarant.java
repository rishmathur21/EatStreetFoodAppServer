package com.example.cs4550projserver.models;

public class FavoritedRestuarant {
    private String username;
    private String restaurantId;
    private String restaurantName;

    public FavoritedRestuarant(String username, String restaurantId, String restaurantName) {
        this.username = username;
        this.restaurantId = restaurantId;
        this.restaurantName = restaurantName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }
}
