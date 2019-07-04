package basicMethods;
import javax.swing.*;
public class whiteSpaceTest {
	public static void main(String[] args) {
		char ch = JOptionPane.showInputDialog("Enter the string").charAt(0);
		boolean b = Character.isWhitespace(ch);
		System.out.println(b);
	}
}
