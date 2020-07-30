
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int c = s.nextInt();
		int fact = 1;
		if(c==0)
		{
			System.out.println(1);
		}
		else {
		for(int i = 1;i <= c ;i++)
		{
			
			fact = fact*i;
		}
		System.out.println(fact);
		}
	} 
}