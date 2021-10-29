package com.qa.enumlist;

import java.util.Random;

import com.qa.enumlist.Card.Ranks;
import com.qa.enumlist.Card.Suits;

public class Dealer {


	public Card draw() {
	Ranks rank = Ranks.values()[new Random().nextInt(Ranks.values().length)];
	Suits suit = Suits.values()[new Random().nextInt(Suits.values().length)];
	return new Card (suit,rank);
	}	
	
}
