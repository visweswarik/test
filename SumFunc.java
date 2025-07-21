import java.util.Scanner;
public class SumFunc{
	static int SumF(int num){
		if(num==0){
			return 0;
		}
		return num + SumF(num-1);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("Sum of numbers "+SumF(n));
	}

}
