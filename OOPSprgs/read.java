package oOPSprgs;
import java.util.*;
import java.io.*;

public class read {
	private String arr[] = new String[50];
	private int count = 0;
	private String result = "";
	
	public void readFile(String fileName)
	{
		try
		{
			Scanner scFile = new Scanner(new File(fileName));
			while(scFile.hasNext())
			{
				arr[count] =scFile.nextLine();
				count++;
			}
			scFile.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("File not found");
		}
	}
	public void process()
	{
		for(int i = 0; i<count; i++)
		{
			Scanner scLine = new Scanner(arr[i]);
			result = result + scLine.next().charAt(0) + ". " + scLine.next() + " " + scLine.nextInt() + " " + scLine.next().charAt(0);
			scLine.close();
		}
	}
	public String printResult()
	{
		return result;
	}
}
