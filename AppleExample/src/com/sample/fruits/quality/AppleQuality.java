package com.sample.fruits.quality;

import java.util.Arrays;

import com.sample.fruits.bean.Apple;
import com.sample.fruits.bean.AppleExampleConstants;

 

public class AppleQuality {
	
	/**
	 * Apple Colors.
	 */
	private final String[] appleColors = {AppleExampleConstants.RED, AppleExampleConstants.GREEN, AppleExampleConstants.BLUE};
	
	/**
	 * This API validates the apples weight and check whether apple weight is with in range or not.
	 * @param apple - Apple object.
	 * @return boolean
	 */
	public boolean validateWeight(Apple apple){
		if(apple != null && apple.getWeightInGrams() >= 10.0 && apple.getWeightInGrams()<=100.00){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * This API validates the Apple color and return false if color in not within color range.
	 * @param apple - Apple object.
	 * @return boolean
	 */
	public boolean validateColor(Apple apple){
		
		if(apple != null && Arrays.asList(appleColors).contains(apple.getColor())){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * This API checks the Apple is eatable or not.
	 * @param apple - Apple object
	 * @return boolean.
	 */
	public boolean isEatable(Apple apple){
		if( validateWeight(apple) && validateColor(apple) && isPeelable(apple)){
			return true;
		}else{
			return false;
		}
	}
	
	/**
	 * This API checks whether Apple is peelable or not.
	 * @param apple - Apple Object.
	 * @return boolean.
	 */
	public boolean isPeelable(Apple apple){
		if(apple != null && !apple.isWormInside() && apple.getTaste() > 3){
			return true;
		}
		else{
			return false;
		}
	}
	
	/**
	 * This API checks whether special peeler is required for this apple object.
	 * @param apple - Apple Object.
	 * @return boolean.
	 */
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
