package com.qa.main;

import com.qa.hashes.MorseCode;

public class Runner {
public static void main(String[] args) {
	
	MorseCode translator = new MorseCode();
    System.out.println(translator.streamTranslate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
	System.out.println(translator.noStream("... --- ..."));
	System.out.println(translator.streamTranslate(".... . ... .... .- ... -. --- -.. .--. ..."));
}
}
