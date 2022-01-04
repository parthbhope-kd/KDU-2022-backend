import java.util.*;
import java.lang.*;
class program1
{
	static int N;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter N");
		N = sc.nextInt();
		pattern1();
		pattern2();
		pattern3();
	}
	
	public static void pattern1()
	{
		System.out.println("Pattern 1");
		
	}
	
	
	public static void pattern2()
	{
		System.out.println("Pattern 2");
		for(int i = 1;i*i<=N;i++)
		{
			System.out.println(i*i);
		}
	}
	
	
	public static void pattern3()
	{
		System.out.println("Pattern 3");
		int num = 1;
		int prevans = 1;
		int ans = 1;
		int i,j;
		System.out.println(prevans);
		int count = 0;
		for(i=1,j=2; prevans<=N;i+=3,j+=3,count++)
		{
			int k = i*4;
			int l = j*4;
			System.out.println(k+prevans);
			System.out.println(k+l+prevans);
			prevans = k+l+prevans;
			
		}
		
		
		
	}
	
	
}
