import java.util.Scanner;
public class Remove{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the element to be removed");
		int rem = scan.nextInt();
		System.out.println("Enter the length of array");
		int n = scan.nextInt();
		int[] arr = new int[n];
		int j=0;
		int count =0;
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
			if(arr[i]!=rem){
				count++;
			}
		}
		int[] result = new int[count];
		for(int i=0;i<n;i++){
			if(arr[i]!=rem){
				result[j++]=arr[i];
			}

		}
		System.out.println("Removed array");
		for(int res:result){
			System.out.print(res+" ");
		}
	}
}
