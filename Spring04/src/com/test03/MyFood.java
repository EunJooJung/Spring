package com.test03;

public class MyFood {
	
	private Food favoriteFood;
	private Food unFavoriteFood;
	
	
	public MyFood(Food favoriteFood, Food unFavoriteFood) {
		super();
		this.favoriteFood = favoriteFood;
		this.unFavoriteFood = unFavoriteFood;
	}
	
	public MyFood() {
		this.favoriteFood = new Food("짬뽕", "8000");
		this.unFavoriteFood = new Food("동태찌개", "8000");
		
	}

	public Food getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(Food favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	public Food getUnFavoriteFood() {
		return unFavoriteFood;
	}

	public void setUnFavoriteFood(Food unFavoriteFood) {
		this.unFavoriteFood = unFavoriteFood;
	}

	@Override
	public String toString() {
		return "favoriteFood : " + favoriteFood + ", unFavoriteFood : " + unFavoriteFood;
	}
	
	

}
