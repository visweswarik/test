import java.util.Scanner;
public class Fact{
	static int Factorial(int n){
		if(n==1){
			return 1;
		}
		return n*Factorial(n-1);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Factorial of number : "+Factorial(num));
	}
}
