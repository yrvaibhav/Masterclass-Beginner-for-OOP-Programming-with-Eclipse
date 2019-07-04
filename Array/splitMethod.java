package array;

public class splitMethod {
	public static void main(String[] args) {
		String stg = "This is a Ramdom Array";
		String arr[] = stg.split(" ");
		System.out.println(arr.length);
		
		for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}
