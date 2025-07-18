import java.util.Scanner;
public class Numback{
	static void Numbac(int n){
		if(n<=0){
			return;
		}
		Numbac(n-1);
		System.out.println(n);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		Numbac(num);
	}
}
