import java.util.Scanner;
public class Avg{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = scan.nextInt();
		int[] arr = new int[n];
		int sum =0;
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
			sum+=arr[i];
		}
		System.out.println("Average of numbers in array is " + sum/n);
	}
}
