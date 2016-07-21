package com.bloc.generics;

import com.bloc.generics.things.*;

public class Main extends Object {

	public static void main(String [] args) {

		ToyBox toyBox = new ToyBox();
		
		ActionFigure mSup = new ActionFigure();
		Book mShakespeare = new Book();
		Spoon mPlastic = new Spoon();
		
		Toy<ActionFigure> mSuperman = new Toy<ActionFigure>(mSup);
		Toy<Book> mHamlet = new Toy<Book>(mShakespeare);
		Toy<Spoon> mSoup = new Toy<Spoon>(mPlastic);
		
		
		toyBox.addToy(mSuperman);
		toyBox.addToy(mHamlet);
		toyBox.addToy(mSoup);
		
		/************************************************
 		 *	ASSIGNMENT:
 		 *	Place several Toy objects into toyBox
		/************************************************/

		assert toyBox.getToyCount() > 0 : "Let's get some toys in that box!";
		System.out.println("Inside your toybox you've got:");
		for (int i = 0; i < toyBox.getToyCount(); i++) {
			System.out.println("- " + toyBox.getToyAtIndex(i).get());
		}
		System.out.println("Sounds like fun!\n");

		System.out.println("/************************/");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/*   If you see this,   */");
		System.out.println("/*   congratulations!   */");
		System.out.println("/*                      */");
		System.out.println("/*                      */");
		System.out.println("/************************/\n");
	}
}
