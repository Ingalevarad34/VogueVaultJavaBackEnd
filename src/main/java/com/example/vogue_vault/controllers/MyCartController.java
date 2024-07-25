package com.example.vogue_vault.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.vogue_vault.entities.MyCart;
import com.example.vogue_vault.services.MyCartServices.MyCartServicesImpl;

@RestController
public class MyCartController {

	@Autowired
	MyCartServicesImpl obj;
	
	@PostMapping("/myCart/addToCart")
	public String addToCart(@RequestBody MyCart m) {
		return obj.addToCart(m);
	}
	
	@PostMapping("/myCart/addAllCartItems")
	public String addAllCartItems(@RequestBody List<MyCart> l) {
		return obj.addAllCartItems(l);
	}
	
	@GetMapping("/myCart/getCartItems")
	public Iterable<MyCart> getCartItems(){
		return obj.getCartItems();
	}
	
	@DeleteMapping("/myCart/deleteAllCartItems")
	public String deleteAllCartItems() {
		return obj.deleteAllCartItems();
	}
	
	@PostMapping("/myCart/deleteCartItem")
	public String deleteCartItem(@RequestBody int id) {
		return obj.deleteCartItem(id);
	}
}
