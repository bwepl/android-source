package com.bloc.interfaces.people;

/************************************************
 *	ASSIGNMENT:
 *	Have Albert implement the SalsaDancer interface
/************************************************/

public class Albert extends Person implements SalsaDancer {
	public Albert() {
		super("Albert", "Cobb", "Male", 1.8d, 72d, "Green");
	}
	
	@Override
	public void putOnShoes()
	{
		//Tie shoes
	}
	
	@Override
	public void findAPartner()
	{
		//get a salsa partner
	}
	
	@Override
	public void salsa()
	{
		//Dance
	}
	
}