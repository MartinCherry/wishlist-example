package io.codelex.wishlistexample.wishes;

import io.codelex.wishlistexample.wishes.domain.Wish;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class WishControllerTest {

    Wish testWish = new Wish();
    @Mock
    WishService service;

    @InjectMocks
    WishController controller;

    @Test
    public void shouldInteractWishSaveOrUpdate(){
        controller.saveWish(testWish);
        verify(service).saveOrUpdate(testWish);
    }

    @Test
    public void shouldInteractWithGetWishById(){
        controller.getWIsh(1);
        verify(service).getWishById(1);
    }

    @Test
    public void shouldInteractWithGetAllWishes(){
        controller.getAllWishes();
        verify(service).getAllWishes();
    }

    @Test
    public void shouldInteractWithDeleteWish(){
        controller.deleteWish(1);
        verify(service).delete(1);
    }

}
