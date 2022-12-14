package io.codelex.wishlistexample.wishes;


import io.codelex.wishlistexample.wishes.domain.Wish;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WishRepository extends CrudRepository<Wish, Integer> {

}
