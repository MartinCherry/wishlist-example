package io.codelex.wishlistexample.wishes.controller;

import io.codelex.wishlistexample.wishes.domain.Wish;
import io.codelex.wishlistexample.wishes.service.WishService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/wishes")
public class WishController {

    private final WishService wishService;

    public WishController(WishService wishService) {
        this.wishService = wishService;
    }

    @GetMapping()
    private List<Wish> getAllWishes() {
        return wishService.getAllWishes();
    }

    @GetMapping("/{id}")
    private Wish getWIsh(@PathVariable("id") int id) {
        return wishService.getWishById(id);
    }

    @DeleteMapping("/{id}")
    private void deleteWish(@PathVariable("id") int id) {
        wishService.delete(id);
    }

    @PostMapping()
    private int saveWish(@RequestBody Wish wish) {
        wishService.saveOrUpdate(wish);
        return wish.getId();
    }
}
