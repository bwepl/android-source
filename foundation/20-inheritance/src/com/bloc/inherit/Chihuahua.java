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
	
	@Override
	public void feed() 
	{
		float weight = getWeight();
		setWeight(weight + getWeightGain());
		// Pre-increment feed counter
		if (++mFeedCounter == 5) 
		{
			changeSize(true);
			mFeedCounter = 0;
		}
	}
	
}