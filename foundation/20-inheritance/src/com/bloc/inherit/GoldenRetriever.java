package com.bloc.inherit;

/************************************************
 *	ASSIGNMENT:
 *	Define the GoldenRetriever class below
 *
 *	Golden Retrievers shrink to a smaller size after
 *	playing only 3 times.
/************************************************/

public class GoldenRetriever extends Dog {
	
	int mPlayCounter = 0;
	float weight = super.getWeight();
	float minWeight = super.getMinWeight();
	
	@Override
	public void play() 
	{
		super.setWeight(weight - super.getWeightLoss());
		if (weight < minWeight) 
		{
			super.setWeight(minWeight);
		}
		// Pre-increment play counter
		if (++mPlayCounter == 3) {
			super.changeSize(false);
			mPlayCounter = 0;
		}
	}
	
		
}