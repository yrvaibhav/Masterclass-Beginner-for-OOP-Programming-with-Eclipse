package array;
import javax.swing.*;

public class splitArrayNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = JOptionPane.showInputDialog("Enter a list of sport for the first sportsman");
		String ar1[] = s1.split(" ");
		String s2 = JOptionPane.showInputDialog("Enter a list of sport for the second sportsman");
		String ar2[] = s2.split(" ");
		
		if(ar1.length > ar2.length)
		{
			System.out.println("The first sportsman does more sports");
			for(int i = 0; i < ar1.length; i++)
			{
				System.out.println(ar1[i]);
			}
		}
		else
		{
			System.out.println("The second sportsman does more sports");
			for(int i = 0; i < ar2.length; i++)
			{
				System.out.println(ar2[i]);
			}
		}
	}

}
