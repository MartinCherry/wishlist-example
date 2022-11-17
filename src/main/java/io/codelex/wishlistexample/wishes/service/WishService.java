package io.codelex.wishlistexample.wishes.service;

import io.codelex.wishlistexample.wishes.domain.Wish;
import io.codelex.wishlistexample.wishes.repository.WishRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class WishService {


    private final WishRepository wishRepository;

    public WishService(WishRepository wishRepository) {
        this.wishRepository = wishRepository;
    }

    public List<Wish> getAllWishes() {
        List<Wish> wishes = new ArrayList<>();
        wishRepository.findAll().forEach(wishes::add);
        return wishes;
    }

    public Wish getWishById(int id) {
        return wishRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Wish " +
                "not found"));
    }

    public void saveOrUpdate(Wish wish) {
        wishRepository.save(wish);
    }

    public void delete(int id) {
        try {
            wishRepository.deleteById(id);
        }
        catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Wish not found");
        }
    }

}
