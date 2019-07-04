package oOPSprgs;

public class process {
	public String processName(String name)
	{
	      	name =name.charAt(0) + ". "+ name.substring(name.indexOf(" ") + 1);
	      	return name;
	}
}
