package com.example.vogue_vault.services.ClothesServices;

import java.util.List;

import com.example.vogue_vault.entities.Clothes;

public interface ClothesServices {

	String addAllClothes(List<Clothes> l);
	String addCloth(Clothes c);
	Iterable<Clothes> getAllClothes();
	String deleteAllClothes();
	String deleteClothes(int id);
}
