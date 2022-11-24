package io.codelex.wishlistexample.wishes;

import io.codelex.wishlistexample.wishes.domain.Wish;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class WishService {


    private final WishRepository wishRepository;

    public WishService(WishRepository wishRepository) {
        this.wishRepository = wishRepository;
    }

    public Iterable<Wish> getAllWishes() {
        return wishRepository.findAll();
    }

    public Wish getWishById(int id) {
        return wishRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Wish " + "not found"));
    }

    public void saveOrUpdate(Wish wish) {
        wishRepository.save(wish);
    }

    public void delete(int id) {
        Wish wishForDeletion = wishRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Wish not found"));
        wishRepository.delete(wishForDeletion);
    }

}
