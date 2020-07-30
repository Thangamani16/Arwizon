
public class Fibonacci {
	public static void main(String[] args) {
		int a = -1,b =1, C =10, sum;
		for(int i = 0; i<C;i++) {
			sum= a+b;
			a = b;
			b = sum;
			System.out.println(sum);
		}

	}

}
