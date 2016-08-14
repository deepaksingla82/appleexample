package com.sample.fruits.quality;

import java.util.Arrays;

import com.sample.fruits.bean.Apple;
import com.sample.fruits.bean.AppleExampleConstants;

 

public class AppleQuality {
	
	private final String[] appleColors = {AppleExampleConstants.RED, AppleExampleConstants.GREEN, AppleExampleConstants.BLUE};
	
	public boolean validateWeight(Apple apple){
		if(apple != null && apple.getWeightInGrams() >= 10.0 && apple.getWeightInGrams()<=100.00){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean validateColor(Apple apple){
		
		if(apple != null && Arrays.asList(appleColors).contains(apple.getColor())){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isEatable(Apple apple){
		if( validateWeight(apple) && validateColor(apple) && isPeelable(apple)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean isPeelable(Apple apple){
		if(apple != null && !apple.isWormInside() && apple.getTaste() > 3){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean isSpecialPeelerRequired(Apple apple){
		if(apple != null 
				&& apple.getColor() != null && apple.getColor().length() >0 
				&& apple.getColor().equalsIgnoreCase(AppleExampleConstants.BLUE)){
			return true;
		}else{
			return false;
		}
		
	}

}
