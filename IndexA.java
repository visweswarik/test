import java.util.Scanner;
public class IndexA{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number to be checked");
		int chk = scan.nextInt();
		System.out.println("Enter the length of array");
		int n = scan.nextInt();
		int[] arr = new int[n];
		int flag = -1;
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
			if(arr[i]==chk){
				flag =i;
				break;
			}
		}
		if(flag>=0){
			System.out.println("The number is found at the index " +flag);
	}
	else{
		System.out.println("The number is not found in the array");
	}
		
	}
}
