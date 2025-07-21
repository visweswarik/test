import java.util.Scanner;
public class ValContain{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int len = scan.nextInt();
		int[] arr = new int[len];
		for(int i=0;i<len;i++){
			arr[i]=scan.nextInt();
		}
		System.out.println("Enter the number to be checked");
		int chk = scan.nextInt();
		boolean flag = false;
		for(int i=0;i<len;i++){
			if(arr[i]==chk){
				flag = true;
				break;
			}
		}
		System.out.println(flag);
	}
}
