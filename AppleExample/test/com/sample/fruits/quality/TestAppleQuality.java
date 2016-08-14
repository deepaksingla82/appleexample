package com.sample.fruits.quality;

import junit.framework.TestCase;

import com.sample.fruits.bean.Apple;
import com.sample.fruits.bean.AppleExampleConstants;

public class TestAppleQuality extends TestCase {
	
	private Apple greenAppleWithWorm = new Apple(AppleExampleConstants.GREEN, 80.0f, 4, true);
	
	private Apple greenEatableApple = new Apple(AppleExampleConstants.GREEN, 70.0f, 4, false);
	
	private Apple blueEatableApple = new Apple(AppleExampleConstants.BLUE, 70.0f, 4, false);
	
	private Apple redHeavyApple = new Apple(AppleExampleConstants.RED, 110.0f, 4, false);
	
	private Apple blackApple = new Apple(AppleExampleConstants.BLACK, 90.0f, 4, false);
	
	private Apple greenSmallEatableApple = new Apple(AppleExampleConstants.GREEN, 9.0f, 4, false);
	
	private AppleQuality quality = new AppleQuality();
	
	
	public void testIsEatable_NullObject(){
		boolean isAppleEatable = quality.isEatable(null);
		assertFalse(isAppleEatable);
	}
	
	
	
	public void testValidateColor_WormAppleObject(){
		boolean isRightColor = quality.validateColor(greenAppleWithWorm);
		assertTrue(isRightColor);
	}
	
	public void testValidateWeight_WormAppleObject(){
		boolean isRightWeight = quality.validateWeight(greenAppleWithWorm);
		assertTrue(isRightWeight);
	}
	
	public void testIsEatable_WormAppleObject(){
		boolean isAppleEatable = quality.isEatable(greenAppleWithWorm);
		assertFalse(isAppleEatable);
	}
	
	public void testSpecialPeelerRequired_WormAppleObject(){
		boolean isSpecialPeeler = quality.isSpecialPeelerRequired(greenAppleWithWorm);
		assertFalse(isSpecialPeeler);
	}

	
	
	public void testValidateColor_AppleObject(){
		boolean isRightColor = quality.validateColor(greenEatableApple);
		assertTrue(isRightColor);
	}
	
	public void testValidateWeight_AppleObject(){
		boolean isRightWeight = quality.validateWeight(greenEatableApple);
		assertTrue(isRightWeight);
	}
	
	public void testIsEatable_AppleObject(){
		boolean isAppleEatable = quality.isEatable(greenEatableApple);
		assertTrue(isAppleEatable);
	}
	
	public void testSpecialPeelerRequired_AppleObject(){
		boolean isAppleEatable = quality.isSpecialPeelerRequired(greenEatableApple);
		assertFalse(isAppleEatable);
	}
	
	public void testSpecialPeelerRequired_BlueAppleObject(){
		boolean isSpecialPeeler = quality.isSpecialPeelerRequired(blueEatableApple);
		assertTrue(isSpecialPeeler);
	}
	
	
	
	
	public void testValidateColor_HeavyAppleObject(){
		boolean isRightColor = quality.validateColor(redHeavyApple);
		assertTrue(isRightColor);
	}
	
	public void testValidateWeight_HeavyAppleObject(){
		boolean isRightWeight = quality.validateWeight(redHeavyApple);
		assertFalse(isRightWeight);
	}
	
	public void testIsEatable_HeavyAppleObject(){
		boolean isAppleEatable = quality.isEatable(redHeavyApple);
		assertFalse(isAppleEatable);
	}
	
	public void testSpecialPeelerRequired_HeavyAppleObject(){
		boolean isSpecialPeeler = quality.isSpecialPeelerRequired(redHeavyApple);
		assertFalse(isSpecialPeeler);
	}
	
	
	
	public void testValidateColor_BlackAppleObject(){
		boolean isRightColor = quality.validateColor(blackApple);
		assertFalse(isRightColor);
	}
	
	public void testValidateWeight_BlackAppleObject(){
		boolean isRightWeight = quality.validateWeight(blackApple);
		assertTrue(isRightWeight);
	}
	
	public void testIsEatable_BlackAppleObject(){
		boolean isAppleEatable = quality.isEatable(blackApple);
		assertFalse(isAppleEatable);
	}
	
	public void testSpecialPeelerRequired_BlackAppleObject(){
		boolean isSpecialPeeler = quality.isSpecialPeelerRequired(blackApple);
		assertFalse(isSpecialPeeler);
	}
	
	
	
	public void testValidateColor_smallAppleObject(){
		boolean isRightColor = quality.validateColor(greenSmallEatableApple);
		assertTrue(isRightColor);
	}
	
	public void testValidateWeight_smallAppleObject(){
		boolean isRightWeight = quality.validateWeight(greenSmallEatableApple);
		assertFalse(isRightWeight);
	}
	
	public void testIsEatable_smallAppleObject(){
		boolean isAppleEatable = quality.isEatable(greenSmallEatableApple);
		assertFalse(isAppleEatable);
	}
	
	public void testSpecialPeelerRequired_smallAppleObject(){
		boolean isSpecialPeeler = quality.isSpecialPeelerRequired(greenSmallEatableApple);
		assertFalse(isSpecialPeeler);
	}

}
