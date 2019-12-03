package com.qa.app;

public class main {
	public static void main(String[] args) {

		Translator translator1 = new Translator();
		translator1.loadMap();
		translator1.translate(
				".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--");
	}
}
