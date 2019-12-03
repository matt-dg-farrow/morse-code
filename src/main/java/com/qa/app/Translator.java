package com.qa.app;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Translator {

	Map<String, String> morseMap = new HashMap<>();

	public void loadMap() {
		morseMap.put(".-", "A");
		morseMap.put("-...", "B");
		morseMap.put("-.-.", "C");
		morseMap.put("-..", "D");
		morseMap.put(".", "E");
		morseMap.put("..-.", "F");
		morseMap.put("--.", "G");
		morseMap.put("....", "H");
		morseMap.put("..", "I");
		morseMap.put(".---", "J");
		morseMap.put("-.-", "K");
		morseMap.put(".-..", "L");
		morseMap.put("--", "M");
		morseMap.put("-.", "N");
		morseMap.put("---", "O");
		morseMap.put(".--.", "P");
		morseMap.put("--.-", "Q");
		morseMap.put(".-.", "R");
		morseMap.put("...", "S");
		morseMap.put("-", "T");
		morseMap.put("..-", "U");
		morseMap.put("...-", "V");
		morseMap.put(".--", "W");
		morseMap.put("-..-", "X");
		morseMap.put("-.--", "Y");
		morseMap.put("--..", "Z");
		morseMap.put(".----", "1");
		morseMap.put("..---", "2");
		morseMap.put("...--", "3");
		morseMap.put("....-", "4");
		morseMap.put(".....", "5");
		morseMap.put("-....", "6");
		morseMap.put("--...", "7");
		morseMap.put("---..", "8");
		morseMap.put("----.", "9");
		morseMap.put("-----", "0");
		morseMap.put("/", " ");
	}

	public String translate(String a) {
		String[] b = a.split(" ");
		System.out.println("output string wihtout trim: " + Arrays.toString(b));
		System.out.println(b[0]);

		for (int i = 0; i < b.length; i++) {
			String d = b[i];
			System.out.print(morseMap.get(d));

//		}
//		for (String c : morseMap.keySet()) {
//			System.out.println(c);
//			System.out.println(morseMap.get(c));
//
//		}
//		for (b : morseMap.keySet())	{
//			
		}
		return b.toString();

	}
}
