import java.util.Scanner;
public class EvenOdd {
// WAP to check given number is EVEN or ODD.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n =sc.nextInt();
		
		if(n%2==0)
			System.out.println(n+" is even number");
		else
			System.out.println(n+" is odd number");

	}

}
