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
	float weight = getWeight();
	float minWeight = getMinWeight();
	
	@Override
	public void play() 
	{
		setWeight(weight - getWeightLost());
		if (weight < minWeight) 
		{
			setWeight(minWeight);
		}
		// Pre-increment play counter
		if (++mPlayCounter == 3) 
		{
			changeSize(false);
			mPlayCounter = 0;
		}
	}
	
		
}