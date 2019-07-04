package array;
import javax.swing.*;

public class oneDimensional {
	public static void main(String[] args) {
		
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter the lenght"));
		int arr[] = new int[num];
	
		for(int i = 0; i < num; i++)
		{
			arr[i] = Integer.parseInt(JOptionPane.showInputDialog("Enter the number"));
			//System.out.println(arr[i]);
		}
		for(int j = 0; j < num; j++)
		{
			System.out.println(arr[j]);
		}
		
		System.out.println("Lenght of the array is :- " + arr.length);
	}
}
