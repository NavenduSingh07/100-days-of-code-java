import java.util.Scanner;
public class PrimePalindrome {
//WAP to check the given number is prime palindrome or not.
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		int t =n;
		int rev=0;
		int i;
		while(n!=0)
		{
			rev=rev*10+(n%10);
					n=n/10;
		}
		if (rev==t)
		{
			for(i=2; i<rev;i++)
			{
				if(rev % i==0)
				{
					System.out.println("not a prime palindrome");
				break;	
				}
			}
			if(rev==i)
				System.out.println(t+" is a prime palindrome");
		}
		else
			System.out.println(t+ " is not a prime palindrome");

	}

}
