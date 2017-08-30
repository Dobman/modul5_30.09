package pl.coderslab.controller;

import java.util.Random;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import pl.coderslab.entity.Cart;
import pl.coderslab.entity.CartItem;
import pl.coderslab.entity.Product;

@Controller
public class CartController {

	private Cart cart;

	@RequestMapping("/addtocart")
	@ResponseBody
	public String addtocart(Model model, HttpSession ses) {
		Random rand = new Random();
		cart.addToCart(new CartItem(1, new Product("prod" + rand.nextInt(10), rand.nextDouble())));
		return "addtocart";
	}

	@RequestMapping("/cart")
	@ResponseBody
	public String getCart(Model model, HttpSession ses) {
		
		return cart.getCartItems().toString();
	}

	@Autowired
	public void setCart(Cart cart) {
		this.cart = cart;
	}
}
