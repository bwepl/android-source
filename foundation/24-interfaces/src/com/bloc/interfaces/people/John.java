package com.bloc.interfaces.people;

/************************************************
 *	ASSIGNMENT:
 *	Have John implement the Driver interface
/************************************************/

public class John extends Person implements Driver {
	//bool mInCar = false;
	//bool mCarOn = false;
	//String mSpeed = null;
	
	public John() 
	{
		super("John", "Smith", "Male", 1.7d, 69d, "Brown");
	}
	
	@Override
	public void getInCar()
	{
		// Get in the Car
		//mInCar = true;
	}
	
	@Override
	public void startEngine()
	{
		// Start the engine
		//mCarOn = true;
	}
	
	@Override
	public void driveFast()
	{
		// Drive Fast
		//mSpeed = "fast";
	}
}