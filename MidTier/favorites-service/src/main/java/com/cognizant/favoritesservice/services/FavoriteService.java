package com.cognizant.favoritesservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.favoritesservice.entities.Item;
import com.cognizant.favoritesservice.repository.FavoriteRepository;


@Service
public class FavoriteService {
	@Autowired
	FavoriteRepository favoriteRepository;
	
	public List<Item> getAllFavorites(){
		return favoriteRepository.findAll();
	}
	public List<Item> getFavoritesByUsername(String username){
		return favoriteRepository.findByUsername(username);
	}
	public Item addFavorite(Item item) {
		return favoriteRepository.save(item);
	}
	public void removeFavorite(Item item) {
		favoriteRepository.delete(item);
	}
	public Item modifyFavorite(Item item) {
		return favoriteRepository.save(item);
	}
}
