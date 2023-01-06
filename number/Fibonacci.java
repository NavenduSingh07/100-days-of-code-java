import java.util.Scanner;
public class Fibonacci {
//WAP to display Fibonacci series of a number.
	
		static int fib(int n)
		{
			if(n==0)
				return 0;
			if(n==1)
				return 1;
			return fib(n-1)+fib(n-2);
		}
		public static void main(String[] args) {
			Scanner sc= new Scanner(System.in);
			System.out.println("Enter a number: ");
			int m=sc.nextInt();
			int f=fib(m);
			System.out.println(f);
	}

}
//A series of numbers in which each number (Fibonacci number) is the sum of the 
//two preceding numbers. The simplest is the series 1,1,2,3,5,8, etc. 