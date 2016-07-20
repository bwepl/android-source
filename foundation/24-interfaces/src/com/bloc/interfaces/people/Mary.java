package com.bloc.interfaces.people;

/************************************************
 *	ASSIGNMENT:
 *	Have Mary implement the Skydiver interface
/************************************************/

public class Mary extends Person implements SkyDiver {
	
	//bool mBoarded = false;
	
	
	public Mary() {
		super("Mary", "Whiters", "Female", 1.65d, 62d, "Blue");
	}
	
	
	@Override
	public void getInPlane()
	{
		// Board the plane
		//mBoarded = true;
	}
	
	@Override
	public void jumpFromPlane()
	{
		//Jump
	}
	
	@Override
	public void releaseParachute()
	{
		//Pull the D ring
	}
}