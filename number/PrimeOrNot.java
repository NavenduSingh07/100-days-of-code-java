import java.util.Scanner;
public class PrimeOrNot {
//WAP to check whether the given number is Prime OR not.
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n =sc.nextInt();
		int i;
		
		if(n==1)
		{
			System.out.println("Prime starts from 2"); 
		}
		for(i=2;i<n;i++)
		{
			if(n%i==0)
				System.out.println("not a Prime");
			break;
		}
		if(n==i)
			System.out.println("Prime");

	}

}
