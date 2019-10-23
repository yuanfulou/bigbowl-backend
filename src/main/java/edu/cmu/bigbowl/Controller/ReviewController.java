package edu.cmu.bigbowl.Controller;

import edu.cmu.bigbowl.Entity.Review;
import edu.cmu.bigbowl.Service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    // GET
    @RequestMapping(method = RequestMethod.GET)
    public Collection<Review> getAllReviews() {
        return reviewService.getAllReviews();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Review getReviewById(@PathVariable("id") String id) {
        return reviewService.getReviewById(id).orElse(null);
    }

    // DELETE
    @RequestMapping(method = RequestMethod.DELETE,  consumes = MediaType.APPLICATION_JSON_VALUE)
    public Review deleteReview(@RequestBody Review review) {
        return reviewService.deleteReview(review).orElse(null);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Review deleteReviewById(@PathVariable("id") String id) {
        return reviewService.deleteReviewById(id).orElse(null);
    }

    @RequestMapping(value = "/reset", method = RequestMethod.DELETE)
    public void deleteAccounts() {
        reviewService.deleteAccounts();
    }

    // PATCH
    @RequestMapping(method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Review updateReview(@RequestBody Review review) {
        return reviewService.updateReviews(review).orElse(null);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PATCH)
    public Review updateReviewById(@PathVariable("id") String id, @RequestBody Review review) {
        return reviewService.updateReviewById(id, review).orElse(null);
    }

    // POST
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public Review insertReview(@RequestBody Review review) {
        return reviewService.postReview(review);
    }
}