package basicMethods;
import javax.swing.*;

public class compareToMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String w1 = JOptionPane.showInputDialog("Enter the string 1 ");
		String w2 =JOptionPane.showInputDialog("Enter the string 2 ");
		
		int num = w1.compareTo(w2);
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(num);
		
		if(w1.compareTo(w2) < 0)
		{
			System.out.println(w1 + " then "+ w2);
		}
		else {
			System.out.println(w2 + " then "+ w1);
		}
	}

}
