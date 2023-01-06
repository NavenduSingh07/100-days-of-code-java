import java.util.Scanner;
public class FactRange {
//WAP to find the factorial of a given Range of numbers.
	static int fact (int n)
	{
		int fact=1;
		while(n>0)
		{
			fact=fact*n;
			n--;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the factorial range number: ");
		int K= sc.nextInt();
		
		for(int i=1; i<=K; i++)
		{
			System.out.println(i+"! ------> "+fact(i));
		}

	}

}
