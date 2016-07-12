package com.bloc.securitypackages.fruit;
//package com.bloc.securitypackages.fruit.apples;
import com.bloc.securitypackages.colors.Color;

/************************************************
 *	YOU MAY MODIFY THIS FILE AND/OR ITS LOCATION
/************************************************/

abstract class Apple extends Fruit {

	Apple()
	{
		super();
	}
	
	Apple(String name, int calories, Color color, double weight)
	{
		super(name, calories, color, weight);
	}
	
	abstract void bite();

}