package com.qa.hashes;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MorseCode {

	private final Map<String, String> morseTranslator;

    public MorseCode(){
        this.morseTranslator = new HashMap<>();
        
		
	
		this.morseTranslator.put("--..", "z");
		this.morseTranslator.put("-.--","y");
		this.morseTranslator.put("-..-","x");
		this.morseTranslator.put(".--", "w");
		this.morseTranslator.put("...-", "v");
		this.morseTranslator.put("..-", "u");
		this.morseTranslator.put("-","t");
		this.morseTranslator.put("...", "s");
		this.morseTranslator.put(".-.", "r");
		this.morseTranslator.put("--.-","q");
		this.morseTranslator.put(".--.","p");
		this.morseTranslator.put("---","o");
		this.morseTranslator.put("-.", "n");
		this.morseTranslator.put("--", "m");
		this.morseTranslator.put(".-..", "l");
		this.morseTranslator.put("-.-", "k");
		this.morseTranslator.put(".---", "j");
		this.morseTranslator.put("..", "i");
		this.morseTranslator.put("....", "h");
		this.morseTranslator.put("..-.", "f");
		this.morseTranslator.put(".", "e");
		this.morseTranslator.put("-..", "d");
		this.morseTranslator.put("-.-.", "c");
		this.morseTranslator.put("-...", "b");
		this.morseTranslator.put(".-", "a");
		this.morseTranslator.put("/", " ");
	}
//		".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"

	
		public String noStream(String input) {
			String[] arrInput = input.split(" ");
			StringBuilder sb = new StringBuilder();
			for (String e : arrInput) {
			sb.append(morseTranslator.get(e));
			}
				return sb.toString();
			}
		
		public String streamTranslate(String input) {
			return Arrays.stream(input.split(" ")).map(i -> morseTranslator.get(i)).collect(Collectors.joining(""));
		}
			
}
	

	