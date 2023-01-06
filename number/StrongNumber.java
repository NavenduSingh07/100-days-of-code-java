import java.util.Scanner;
public class StrongNumber {
// WAP to check the given number is Strong or not .
	static int fact(int n)
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
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number: ");
		int n =sc.nextInt();
		int num=n;
		int sum=0;
		int t=num;
		
		while(num!=0)
		{
			int r=num%10;
			sum=sum+ fact(r);
			num = num/10;
		}
		
		if(sum==t)
			System.out.println(t+ " is a Strong number");
		else
			System.out.println(t+ " is not a strong number");
	}

}

// Strong Number: are the numbers whose sum of factorial of digits is equal to
// the original number .  example: 145 is a Strong Number.
