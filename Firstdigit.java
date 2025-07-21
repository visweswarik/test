import java.util.Scanner;
public class Firstdigit{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		int n =0;
		if(num>0){
			n=num;
		}
		if(num<0){
			n=-(num);
		}
		while(n>=10){
			n/=10;
		}
		System.out.println("First digit "+n);
	}
}
