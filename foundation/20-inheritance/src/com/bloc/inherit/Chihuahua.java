package com.bloc.inherit;

/************************************************
 *	ASSIGNMENT:
 *	Define the Chihuahua class below
 *
 *	Chiuahuas must be fed 5 times in order to grow
 *	larger.
/************************************************/
public class Chihuahua extends Dog {
	
	int mFeedCounter =0;
	
	public void feed() 
	{
		float weight = super.getWeight();
		super.setWeight(weight + getWeightGain());
		// Pre-increment feed counter
		if (++mFeedCounter == 5) {
			super.changeSize(true);
			mFeedCounter = 0;
		}
	}
	
	public float getWeightGain()
	{
		return super.WEIGHT_GAINED_FROM_FEEDING;
	}
}