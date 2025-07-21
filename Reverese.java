import java.util.Scanner;
public class Reverese{
	static void Rever(int i,int arr[],int n){
		if(i>=n/2){
			return;
		}
		int temp = arr[i];
		arr[i] = arr[n-i-1];
		arr[n-i-1]=temp;
		Rever(i+1,arr,n);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		Rever(0,arr,n);
		System.out.println("Reverse array");
		for(int i=0;i<n;i++){
			System.out.print(arr[i] +" ");
		}
	}
}
