package com.qa.files;

import java.util.Random;

public class randomfiles {

	public static void roll(int diceType, int times) {
		for (int i = 0; i < times; i++) {
			int rolled = new Random().nextInt(diceType) + 1;
			System.out.println(rolled);
		}

	}
}
