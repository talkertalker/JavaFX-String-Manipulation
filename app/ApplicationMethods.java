/*
 * app.ApplicationMethods.java
 * Copyright 2018 TALKER
 * https://github.com/talkertalker
 */

package app;

import javafx.scene.control.TextArea;

public class ApplicationMethods {

	//convertText()
	//Gets user input from FX text area
	//If user input is blank, output a snarky message.
	//Otherwise convert the text to 「t h i s・s t y l e」.
	//------------------------------------------------------------------------------
	public static void convertText(TextArea inputTextArea, TextArea outputTextArea) {
		String[] inputByWord = inputTextArea.getText().split(" "); 
		String output = "「";
		
		if (inputTextArea.getText().equals("") || inputTextArea.getText().equals(" ")) {
			//Check to see if user input is blank or is one " " space
			outputTextArea.setText("「t r y・t y p i n g・i n・s o m e・t e x t,・b o s s」");
			
		} else {
			for (int i = 0; i < inputByWord.length; i++) {
				for (int j = 0; j < inputByWord[i].length(); j++) {
					if (i == inputByWord.length - 1 && j == inputByWord[i].length() - 1) {
						output += inputByWord[i].charAt(j) + "」";
					} else if (j == inputByWord[i].length() - 1) {
						output += inputByWord[i].charAt(j) + "・";
					} else {
						output += inputByWord[i].charAt(j) + " ";
					}
				}		
			}
		
			outputTextArea.setText(output);
			inputTextArea.setText("");
		}
	}
}
