package com.sample.fruits.bean;

public class Apple {
	
	private String color;
	
	private float weightInGrams;
	
	private int taste;
	
	private boolean isWormInside;
	
	public Apple(String color, float weightInGrams, int taste, boolean isWormInside ){
		this.color = color;
		this.weightInGrams = weightInGrams;
		this.taste = taste;
		this.isWormInside = isWormInside;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTaste() {
		return taste;
	}

	public void setTaste(int taste) {
		this.taste = taste;
	}

	public boolean isWormInside() {
		return isWormInside;
	}

	public void setWormInside(boolean isWormInside) {
		this.isWormInside = isWormInside;
	}

	public float getWeightInGrams() {
		return weightInGrams;
	}

	public void setWeightInGrams(float weightInGrams) {
		this.weightInGrams = weightInGrams;
	}

}
