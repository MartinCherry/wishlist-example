package io.codelex.wishlistexample.wishes;


import io.codelex.wishlistexample.wishes.domain.Wish;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class WishServiceTest {

    @Mock
    WishRepository repository;

    @InjectMocks
    WishService service;


    @Test
    public void shouldThrowErrorWhenNotFound(){
        ResponseStatusException exception = Assertions.assertThrows(ResponseStatusException.class,
                () -> service.getWishById(1));
        Assertions.assertEquals(exception.getStatus(), HttpStatus.NOT_FOUND);
    }

    @Test
    public void shouldThrowErrorWhenTryingToDeleteNotExistingWish(){
        ResponseStatusException exception = Assertions.assertThrows(ResponseStatusException.class,
                () -> service.delete(1));
        Assertions.assertEquals(exception.getStatus(), HttpStatus.NOT_FOUND);
    }

    @Test
    public void shouldReturnFirstWish(){

        Wish testWish = createTestWish();

        Mockito.doAnswer(invocation -> Optional.of(testWish)).when(repository).findById(1);
        Wish returnWish = service.getWishById(1);

        Assertions.assertEquals(1, returnWish.getId());

    }

    @Test
    public void shouldReturnWishList(){

        List<Wish> testWishList = createWishList();

        Mockito.doAnswer(invocation -> testWishList).when(repository).findAll();

        Iterable<Wish> returnList = service.getAllWishes();

        Assertions.assertEquals(testWishList, returnList);

    }


    private Wish createTestWish(){
        Wish testWish = new Wish("TestWish");
        testWish.setId(1);
        return testWish;
    }

    private List<Wish> createWishList(){
        List<Wish> wishList = new ArrayList<>();
        for (int i = 0; i<5; i++) {
            wishList.add(createTestWish());
        }
        return wishList;
    }
}
