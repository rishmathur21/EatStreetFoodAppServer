package com.example.cs4550projserver.models;

public class RestaurantComment {
    private String username;
    private String restaurantId;
    private String comment;

    public RestaurantComment(String username, String restaurantId, String comment) {
        this.username = username;
        this.restaurantId = restaurantId;
        this.comment = comment;
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

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
