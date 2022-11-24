package io.codelex.wishlistexample.wishes;

import io.codelex.wishlistexample.wishes.domain.Wish;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/wishes")
public class WishController {

    private final WishService wishService;

    public WishController(WishService wishService) {
        this.wishService = wishService;
    }

    @GetMapping()
    public Iterable<Wish> getAllWishes() {
        return wishService.getAllWishes();
    }

    @GetMapping("/{id}")
    public Wish getWIsh(@PathVariable("id") int id) {
        return wishService.getWishById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteWish(@PathVariable("id") int id) {
        wishService.delete(id);
    }

    @PostMapping()
    public int saveWish(@RequestBody Wish wish) {
        wishService.saveOrUpdate(wish);
        return wish.getId();
    }
}
