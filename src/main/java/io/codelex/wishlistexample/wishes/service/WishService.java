package io.codelex.wishlistexample.wishes.service;

import io.codelex.wishlistexample.wishes.domain.Wish;
import io.codelex.wishlistexample.wishes.repository.WishRepository;
import org.springframework.stereotype.Service;

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
        return wishRepository.findById(id).get();
    }

    public void saveOrUpdate(Wish wish) {
        wishRepository.save(wish);
    }

    public void delete(int id) {
        wishRepository.deleteById(id);
    }

}
