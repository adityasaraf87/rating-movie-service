package com.javacool.ratingmovieservice.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javacool.ratingmovieservice.model.Rating;
import com.javacool.ratingmovieservice.model.UserRating;

@RestController
@RequestMapping("/ratingsdata")
public class RatingResource {

	@RequestMapping("/{movieId}")	
	public Rating getRatingIngo(@PathVariable("movieId")String movieId) {
		return (new Rating(movieId, 4));
	}
	@RequestMapping("/users/{userId}")	
	public UserRating getRating(@PathVariable("userId")String movieId) {
		List<Rating> ratingList=Arrays.asList(new Rating("Test1", 3),
				new Rating("Test2", 4),
				new Rating("Test3", 2));
		UserRating userRating=new UserRating();
		userRating.setUserRating(ratingList);
		return userRating;
	}

}
