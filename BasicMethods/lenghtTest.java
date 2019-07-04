package basicMethods;
import javax.swing.*;

public class lenghtTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// finding the length of the string
		String word = JOptionPane.showInputDialog("Enter the Password");
		int num = word.length();
		
		//System.out.println(num);
		
		if(num >= 6) {
			System.out.println("Password is valid");
		}else {
			System.out.println("Password is not valid");
		}
	}

}
