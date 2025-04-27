package com.dailycodework.buynowdotcom.service.cart;

import com.dailycodework.buynowdotcom.model.Cart;
import com.dailycodework.buynowdotcom.model.User;
import com.dailycodework.buynowdotcom.repository.CartRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class CartService implements ICartService {
    private final CartRepository cartRepository;

    @Override
    public Cart getCart(Long cartId) {
        return null;
    }

    @Override
    public Cart getCartByUserId(Long userId) {
        return null;
    }

    @Override
    public void clearCart(Long cartId) {

    }

    @Override
    public Cart initializeNewCartForUser(User user) {
        return null;
    }

    @Override
    public BigDecimal getTotalPrice(Long cartId) {
        return null;
    }
}
