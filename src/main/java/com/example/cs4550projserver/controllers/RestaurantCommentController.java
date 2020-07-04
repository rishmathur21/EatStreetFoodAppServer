package com.example.cs4550projserver.controllers;


import com.example.cs4550projserver.models.RestaurantComment;
import com.example.cs4550projserver.services.RestaurantCommentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class RestaurantCommentController {

    RestaurantCommentService service = new RestaurantCommentService();

    @PostMapping("/comments")
    public int addRestaurantComment(@RequestBody RestaurantComment newComment) {
        return service.addRestaurantComment(newComment);
    }

    @GetMapping("/comments/{rid}")
    public List<RestaurantComment> getCommentsForRestaurant(@PathVariable("rid") String restaurantId) {
        return service.getCommentsForRestaurant(restaurantId);
    }

}
