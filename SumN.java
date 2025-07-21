import java.util.Scanner;
public class SumN{
	static int SumNum(int i,int sum){
		if(i<=0){
			return sum;
		}
		return SumNum(i-1,sum+i);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum =0;
		System.out.println("Sum of numbers: "+SumNum(num,sum));
	}
}
