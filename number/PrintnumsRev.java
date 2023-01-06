import java.util.Scanner;
public class PrintnumsRev {
	//WAP to print REVERSE of N to 1 numbers
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		
		for(int i=n; i>=1;i--) {
			System.out.print(" "+i);
		}

	}

}
