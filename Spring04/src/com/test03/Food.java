package com.test03;

public class Food {
	
	private String name;
	private String price;
	
	public Food() {
		
	}
	
	

	public Food(String name, String price) {
		super();
		this.name = name;
		this.price = price;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}



	@Override
	public String toString() {
		return "Food [name=" + name + ", price=" + price + "]";
	}
	
	

}
