package com.dailycodework.buynowdotcom.service.cart;

import com.dailycodework.buynowdotcom.model.Cart;
import com.dailycodework.buynowdotcom.model.CartItem;
import com.dailycodework.buynowdotcom.model.Product;
import com.dailycodework.buynowdotcom.repository.CartItemRepository;
import com.dailycodework.buynowdotcom.repository.CartRepository;
import com.dailycodework.buynowdotcom.service.product.IProductService;
import com.dailycodework.buynowdotcom.service.product.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CartItemService implements ICartItemService {
    private final CartItemRepository cartItemRepository;
    private final ICartService cartService;
    private final IProductService productService;
    private final CartRepository cartRepository;

    @Override
    public void addItemToCart(Long cartId, Long productId, int quantity) {
        Cart cart = cartService.getCart(cartId);
        Product product = productService.getProductById(productId);
        CartItem cartItem = cart.getItems().stream()
                .filter(item -> item.getProduct().getId().equals(productId))
                .findFirst().orElse(new CartItem());
        //CartItemのitemをlistで取得してstreamというベルトコンベアに載せる。

        if(cartItem.getId() == null){
            cartItem.setCart(cart);
            cartItem.setProduct(product);
            cartItem.setQuantity(quantity);
            cartItem.setUnitPrice(product.getPrice());
        }
        else {
            cartItem.setQuantity(cartItem.getQuantity() + quantity);
        }
        cartItem.setTotalPrice();
        cart.addItem(cartId);
        cartItemRepository.save(cartItem);
        cartRepository.save(cart);
    }

    @Override
    public void removeItemFromCart(Long cartId, Long productId) {

    }

    @Override
    public void updateQuantity(Long cartId, Long productId, int quantity) {

    }

    @Override
    public CartItem getCartItem(Long cartId, Long productId) {
        return null;
    }
}
