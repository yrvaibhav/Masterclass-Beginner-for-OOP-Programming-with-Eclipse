package basicMethods;

import javax.swing.*;
public class UpperCaseTest {
	public static void main(String[] args) {
		
		// Converting it into upper case
		String word = JOptionPane.showInputDialog("Enter the word to Converting into upper case");
		System.out.println("Wrod is :- " + word);
		System.out.println("UpperCase word is :- " + word.toUpperCase());
		
		// Converting into lower case
		String word1 = JOptionPane.showInputDialog("Enter the word to Converting into lower case");
		System.out.println("Word is :- " + word1);
		System.out.println("LowerCase word is :- " + word1.toLowerCase());
		
	}
}
