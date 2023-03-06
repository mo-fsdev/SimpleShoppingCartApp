package MO.SimpleShoppingCartApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @GetMapping
    public List<CartItem> getAllCartItems() {
        return cartService.getAllCartItems();
    }

    @GetMapping("/{id}")
    public CartItem getCartItemById(@PathVariable Long id) {
        return cartService.getCartItemById(id);
    }

    @PostMapping
    public CartItem addCartItem(@RequestBody CartItem cartItem) {
        return cartService.addCartItem(cartItem.getName(), cartItem.getQuantity());
    }

    @PutMapping("/{id}")
    public CartItem updateCartItem(@PathVariable Long id, @RequestBody CartItem cartItem) {
        return cartService.updateCartItem(id, cartItem.getName(), cartItem.getQuantity());
    }

    @DeleteMapping("/{id}")
    public void deleteCartItem(@PathVariable Long id) {
        cartService.deleteCartItem(id);
    }
}