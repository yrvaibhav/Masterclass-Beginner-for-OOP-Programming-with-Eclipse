package oOPSprgs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class scannerPratice {
	
	public void fileScan(String filename)
	{
		try
		{
		Scanner scFile = new Scanner(new File(filename));
		
		String line="" , first="" , second="" ;
		int age = 0;
		
		while(scFile.hasNext())
		{
			line = scFile.nextLine();
			
			Scanner scLine = new Scanner(line).useDelimiter("#");
			
			first = scLine.next();
			second = scLine.next();
			age = scLine.nextInt();
			
			scLine.close();
			
			System.out.println(first + " ." + second.charAt(0) + ". " + age);
		}
		scFile.close();
	}
		catch(FileNotFoundException e)
		{
			System.out.println("It's all broken");
		}
	}
}
