package oOPSprgs;
import java.util.*;
import java.io.*;

public class Reader {
	private int count = 0;
	private String arr[] = new String[50];
	private String oldest = "";
	private String results = "";
	
	public Reader(String fileName)
	{
		try
		{
			Scanner scFile =new Scanner(new File(fileName));
			while(scFile.hasNext())
			{
				arr[count] = scFile.nextLine();
				count++;
			}
			scFile.close();
		}
		catch(FileNotFoundException e)
		{
			System.out.println("Could not find file");
		}
	}
	public void findOld()
	{
		int old =0;
		for(int i = 0; i<count; i++)
		{
			Scanner scLine = new Scanner(arr[i]).useDelimiter("#");
			String temp = scLine.next() + " " + scLine.next();
			int num = scLine.nextInt();
			scLine.close();
			if(num > old)
			{
				old = num;
				oldest = temp + " " + old + "is the oldest";
			}
		}
	}
	public void process()
	{
		for(int i = 0 ;i < count; i++)
		{
			Scanner scLine = new Scanner(arr[i]).useDelimiter("#");
			results = results + scLine.next().charAt(0) + " " + scLine.next().charAt(0) + " " +scLine.nextInt() + " \n ";
			scLine.close();
		}
	}
	public void printtofile() {
		try
		{
			PrintWriter outFile = new PrintWriter(new FileWriter("finalresult.txt"));
			outFile.println(oldest + " \n " + results);
			outFile.close();
		}
		catch(IOException e)
		{
			System.out.println("File not found");
		}
	}
}
