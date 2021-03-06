package com.qa.enumlist;

public class Card{

private Suits suits;	
	public static enum Suits {
		HEARTS,
		CLUBS,
		DIAMONDS,
		SPADES;
	}
	
	private Ranks ranks;
	
	public static enum Ranks {
		ACE,
		TWO,
		THREE,
		FOUR,
		FIVE,
		SIX,
		SEVEN,
		EIGHT,
		NINE,
		TEN,
		JACK,
		QUEEN,
		KING;
	}

	public Card(Suits suits, Ranks ranks) {
		super();
		this.suits = suits;
		this.ranks = ranks;
	}

	@Override
	public String toString() {
		return ranks + " OF " + suits;
	}
		
	}
