import java.util.Scanner;
public class RangeofPerfectNum {
//WAP to display RANGE of PERFECT NUMBERS.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int n =sc.nextInt();
		
		for(int num=1;num<=n;num++)
		{
			int sum=1;
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
					sum=sum+i;
			}
			if(sum==num)
			{
				System.out.println(num+" is a parfect number");
				
			}
		}

	}

}
