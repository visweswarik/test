import java.util.Scanner;
public class Numbacking{
	static void NumB(int i,int n){
		if(i>n){
			return;
		}
		NumB(i+1,n);
		System.out.println(i);  
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		NumB(1,num);
	}
}
