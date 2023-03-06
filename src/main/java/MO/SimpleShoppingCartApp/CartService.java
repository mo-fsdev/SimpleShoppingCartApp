package MO.SimpleShoppingCartApp;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CartService {
    private final Map<Long, CartItem> cartItems = new HashMap<>();
    private Long nextId = 1L;

    public List<CartItem> getAllCartItems() {
        return new ArrayList<>(cartItems.values());
    }

    public CartItem getCartItemById(Long id) {
        return cartItems.get(id);
    }

    public CartItem addCartItem(String name, int quantity) {
        CartItem cartItem = new CartItem(nextId++, name, quantity);
        cartItems.put(cartItem.getId(), cartItem);
        return cartItem;
    }

    public CartItem updateCartItem(Long id, String name, int quantity) {
        CartItem cartItem = cartItems.get(id);
        if (cartItem != null) {
            cartItem.setName(name);
            cartItem.setQuantity(quantity);
        }
        return cartItem;
    }

    public void deleteCartItem(Long id) {
        cartItems.remove(id);
    }
}