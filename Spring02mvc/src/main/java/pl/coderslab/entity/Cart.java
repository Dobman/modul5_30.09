package pl.coderslab.entity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Cart {
	List<CartItem> cartItems;

	public Cart() {
		cartItems = new ArrayList<CartItem>();
	}

	public void addToCart(CartItem cartItem) {
		cartItems.add(cartItem);
	}

	public List<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	@Override
	public String toString() {
		return "Cart [cartItems=" + cartItems + "]";
	}

}
