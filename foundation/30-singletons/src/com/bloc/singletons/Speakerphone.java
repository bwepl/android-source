package com.bloc.singletons;

import java.util.*;

/************************************************
 *	ASSIGNMENT:
 *	Populate this class with the defined methods.
 *
 *	This is a singleton class which maintains communication
 *	between Talker and Listener interface objects.
/************************************************/

public class Speakerphone extends Object {
	
	private List<Listener> mListeners;
	private static Speakerphone sCentralSpeaker;
	
	private Speakerphone()
	{
		//speakerphone constructor
	}
	/*
	 * get
	 *
	 * @return the singleton instance of Speakerphone (Speakerphone)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the get method
	/************************************************/
	public static Speakerphone get()
	{
		if (sCentralSpeaker == null)
		{
			sCentralSpeaker = new Speakerphone();
		}
		return sCentralSpeaker;
	}

	/*
	 * addListener
	 *
	 * Add a listener to Speakerphone's list
	 *
	 * @param listener an instance of the Listener interface (Listener)
	 * @return nothing
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the addListener method
	/************************************************/
	public void addListener(Listener listener)
	{
		if (mListeners == null)
		{
			mListeners = new ArrayList<Listener>();
		}
		mListeners.add(listener);
	}

	/*
	 * removeListener
	 *
	 * Remove a Listener from the Speakerphone's list
	 *
	 * @param listener the Listener to remove (Listener)
	 * @return nothing
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the removeListener method
	/************************************************/
	public void removeListener(Listener listen)
	{
		mListeners.remove(listen);
	}
	
	/*
	 * removeAll
	 *
	 * Removes all Listeners from Speakerphone
	 *
	 * @return nothing
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the removeAll method
	/************************************************/
	public void removeAll()
	{
		mListeners.clear();
	}

	/*
	 * contains
	 *
	 * Checks whether a Listener is found in the Speakerphone's
	 * collection.
	 *
	 * @param listener
	 * @return `true` if the Listener has already been added to
	 *		   the Speakerphone, `false` otherwise (boolean)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the contains method
	/************************************************/	
	public boolean contains(Listener lis)
	{
		if (mListeners != null && mListeners.contains(lis))
		{
			return true;
		}
		return false;
	}

	/*
	 * shoutMessage
	 *
	 * Sends the message to all of the Listeners tracked by Speakerphone
	 *
	 * @param talker a Talker whose message will be sent (Talker)
	 * @return nothing
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the shoutMessage method
	/************************************************/
	public void shoutMessage(Talker talker)
	{
		shoutMessage(talker, null);
	}

	/*
	 * shoutMessage
	 *
	 * Sends the message to all of the Listeners which are instances of
	 * the cls parameter
	 *
	 * @param talker a Talker whose message will be sent (Talker)
	 * @param cls a Class object representing the type which the Listener
	 *			  should extend from in order to receive the message (Class)
	 * @return nothing
	 *
	 * HINT: see Class.isAssignableFrom()
	 *		 http://docs.oracle.com/javase/7/docs/api/java/lang/Class.html#isAssignableFrom(java.lang.Class)
	 */
	/************************************************
	 *	ASSIGNMENT:
	 *	Implement the shoutMessage method
	/************************************************/
	public void shoutMessage(Talker talker, Class cls)
	{
		if (talker == null)
		{
			return;
		}
		
		String msg = talker.getMessage();
		if (mListeners != null)
		{
			for (Listener listener : mListeners)
			{
				if (cls == null || listener.getClass().isAssignableFrom(cls))
				{
					listener.onMessageReceived(msg);
				}
			}
		}
		
	}
}