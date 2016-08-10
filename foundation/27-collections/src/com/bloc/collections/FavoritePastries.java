package com.bloc.collections;

import java.util.*;

/*
 * FavoritePastries
 * 
 * This class maintains a record of Pastry objects and their
 * relation to a 1 to 5 rating scale.
 *
 * For example:
 * 5 Star Pastries: Cronut, Cherry Pie
 * 4 Star Pastries: Strudel, Apple Pie
 * 3 Star Pastries: Bear Claw
 * 2 Star Pastries: Pop-Tart
 * 1 Star Pastries: Pot Pie
 *
 * A pastry may not have duplicate entries
 */
public class FavoritePastries {

	/************************************************
 	 *	ASSIGNMENT:
	 *	Use a HashMap to store the relationship
	 *	between rating and pastry: HashMap<Integer, List<Pastry>>
	/************************************************/
	private HashMap<Integer, List<Pastry>> favMap;
	
	private Set<Integer> mKeys;

	public FavoritePastries() {
		/************************************************
 	 	 *	WORK HERE
		/************************************************/
		
		favMap = new HashMap<Integer, List<Pastry>>();
		
		
	}

	/* 
	 * addPastry
	 *
	 * Add a Pastry to the FavoritePastries class.
	 *
	 * This method stores this Pastry and its
	 * associated rating in some sort of data structure.
	 *
	 * If this Pastry already exists in FavoritePastries,
	 * its old rating should be updated.
	 *
	 * @param pastry The Pastry to store
	 * @param rating The rating to associate with it
	 * @return nothing
	 */
	public void addPastry(Pastry addPastry, int rating) {
		/************************************************
 	 	 *	WORK HERE
		/************************************************/
		List<Pastry> addList;
		mKeys = favMap.keySet();
		
		if (!mKeys.isEmpty()) 
		{
			boolean removed = removePastry(addPastry);
			
			//get the set of existing pastries for rating and copy into a new list , remove the existing list
			Set <Pastry> ratingPastries = new HashSet(getPastriesForRating(rating));
			if(!ratingPastries.isEmpty())
			{
				addList = new ArrayList(ratingPastries);
			}
			else
			{
				//if its an empty set, just add to addList
				addList = new ArrayList();
			}
			addList.add(addPastry);
			favMap.remove(rating);
		}
		else  // if the keyset is empty
		{
			addList = new ArrayList();
			addList.add(addPastry);
		}
		//add the new list for rating
		favMap.put(rating, addList);
		
	}

	/* 
	 * removePastry
	 *
	 * Remove a Pastry from FavoritePastries
	 *
	 * This method removes any reference to this exact
	 * Pastry object and its associated rating
	 *
	 * @param pastry The Pastry to remove
	 * @return true if the Pastry was found and removed,
	 *		   false otherwise
	 */
	public boolean removePastry(Pastry pastry) {
		/************************************************
 	 	 *	WORK HERE, you must modify the return value
		/************************************************/
		int rtg =getRatingForPastry(pastry);
		
		if( rtg != -1)
		{
			List<Pastry> rtgPastries = new ArrayList(favMap.get(rtg));
			
			int j = rtgPastries.indexOf(pastry);
			rtgPastries.remove(j);
			
			favMap.remove(rtg);
			favMap.put(rtg, rtgPastries);
			
			return true;
		}
		else
		{
			return false;
		}
		
		
	}

	/* 
	 * getRatingForPastry
	 *
	 * Return the associated rating for a given Pastry
	 *
	 * This method will find the associated rating for
	 * this Pastry inside of FavoritePastries and return
	 * it to its caller.
	 *
	 * @param  pastry The Pastry for which a rating must
	 * 		   be recovered
	 * @return the rating associated with this Pastry or
	 *		   -1 if not found among FavoritePastries
	 */
	public int getRatingForPastry(Pastry pastry) {
		/************************************************
 	 	 *	WORK HERE, you must modify the return value
		/************************************************/
		//get keyset, itereate through the ratings keys, search for the specified pastry
		// and return the rating of that pastry
		mKeys = favMap.keySet();
		
		for(Integer i : mKeys)
		{
			if (getPastriesForRating(i.intValue()).contains(pastry))
			{
				return i.intValue();
			}
		}
		return -1;
	}

	/* 
	 * getPastriesForRating
	 *
	 * Return a Set of all the Pastries with a given
	 * rating.
	 *
	 * This method returns a Set<Pastry> object containing
	 * references to all of the Pastries associated with
	 * a particular rating.
	 *
	 * @param  rating The rating of the Pastry objects the
	 *		   caller wishes to recover
	 * @return A Set of all the Pastry objects with a rating
	 * 		   of `rating`. Returns an empty set if none are
	 *         found
	 */
	public Collection<Pastry> getPastriesForRating(int rating) {
		/************************************************
 	 	 *	WORK HERE, you must modify the return value
		/************************************************/
		if(!favMap.isEmpty() && favMap.get(rating)!=null)
		{
			//return Set<Pastry> rPastries = new HashSet<>(favMap.get(rating));
			return new HashSet<Pastry>(favMap.get(rating));
		}
		else
		{
			return Collections.emptySet();
		}
	}

}