import java.util.Scanner;
public class SwapV {
	//WAP to Swap two number with using 3rd variable.
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number");
		int i=sc.nextInt();
		int j=sc.nextInt();
		//int i=10;
		//int j=20;
		int k;
		
		k=i;
		i=j;
		j=k;
		
		System.out.println("i="+i);
		System.out.println("j="+j);

	}

}
