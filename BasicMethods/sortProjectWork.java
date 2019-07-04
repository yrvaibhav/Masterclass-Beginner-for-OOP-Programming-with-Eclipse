package basicMethods;
import javax.swing.*;

public class sortProjectWork {
	public static void main(String[] args) {
		String fName="" , sName="" , first="" , second="" , temp="ZZZ";
		int age = 0 ;
		
		for (int i = 0; i < 2; i++ )
		{
			while(age <= 18)
			{
				fName = JOptionPane.showInputDialog("Enter your First Name").toUpperCase();
				sName = JOptionPane.showInputDialog("Enter your Second Name").toUpperCase();
				age = Integer.parseInt(JOptionPane.showInputDialog("Enter the age"));
			}
			if(temp.compareTo(sName) > 0)
			{
				temp = sName;
				second = first;
				first = fName + " " + sName.charAt(0) + "\n" + age;
			}
			else {
				second = fName + " " + sName.charAt(0) + "\n" + age;
			}
			age = 0;
		}
		System.out.println(first + "\n" + second);
	}
}
