package substringAndIndexOf;
import javax.swing.*;

public class nameProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String names = JOptionPane.showInputDialog("Enter the first, middle, last name");
		String first = names.substring(0, names.indexOf(' '));
		String middle = names.substring(names.indexOf(' ') + 1, names.lastIndexOf(' '));
		String last = names.substring(names.lastIndexOf(' '));
		
		System.out.println("First: " + first + "\nMiddle: " + middle + "\nLast: " + last);
		System.out.println(first + " " + middle.charAt(0) + "." + last);		
	}

}
