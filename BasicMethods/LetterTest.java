package basicMethods;
import javax.swing.*;
public class LetterTest {
	public static void main(String[] args) {
		
		char ch = JOptionPane.showInputDialog("Enter the word").charAt(0);
		boolean b = Character.isLetter(ch);
		System.out.println(b);
		
		if(Character.isLetter(ch)) {
			System.out.println("Input is correct");
		}else {
			System.out.println("Input is not correct");
		}
	}
}
