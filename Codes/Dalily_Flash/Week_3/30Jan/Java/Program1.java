import java.util.*;

class SwapTwo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a = ");
		int a = sc.nextInt();
		System.out.print("Enter b = ");
		int b = sc.nextInt();
		System.out.println("Before Swap: a = "+a+" & b = "+b);
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After Swap: a = "+a+" & b = "+b);
	}
}
