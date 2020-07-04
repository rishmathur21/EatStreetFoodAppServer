package com.example.cs4550projserver.services;

import com.example.cs4550projserver.models.RestaurantComment;

import java.util.ArrayList;
import java.util.List;

public class RestaurantCommentService {

    List<RestaurantComment> restaurantCommentList = new ArrayList<RestaurantComment>();

    public int addRestaurantComment(RestaurantComment newComment) {
        restaurantCommentList.add(newComment);
        return 1;
    }

    public List<RestaurantComment> getCommentsForRestaurant(String restaurantId) {
        List<RestaurantComment> commentList = new ArrayList<>();

        for (RestaurantComment currComment : restaurantCommentList) {
            if (currComment.getRestaurantId().equals(restaurantId)) {
                commentList.add(currComment);
            }
        }
        return commentList;
    }


}
