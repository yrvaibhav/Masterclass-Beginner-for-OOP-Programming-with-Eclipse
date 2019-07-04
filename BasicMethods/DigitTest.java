package basicMethods;
import javax.swing.*;
public class DigitTest {
	public static void main(String[] args) {
		char ch = JOptionPane.showInputDialog("Enter the number").charAt(0);
		boolean b = Character.isDigit(ch);
		System.out.println(b);
		
		if(Character.isDigit(ch)) {
			System.out.println("Input is correct");
		}else {
			System.out.println("Input is not correct");
		}
	}

}
