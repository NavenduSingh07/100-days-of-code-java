import java.util.Scanner;
public class Parfectnumber {
//WAP weather the number is PERFECT NUMBER or NOT.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int sum =1;
		
		for(int i=2; i<=num/2;i++)
		{
			if(num%i==0)
				sum=sum+i;
		}
		if(sum==num)
		{
			System.out.println(num+" is a parfect number");
		}else {
			System.out.println(num+ " is not a parfect number");
		}

	}

}

//PARFECT NUMBER: a positive integer that is equal to the sum of its proper divisors.
//the smallest parfect number is 6, which is the sum of 1,2,and 3.
