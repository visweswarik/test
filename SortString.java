import java.util.Scanner;
public class SortString{
	static boolean isGreater(String s1,String s2){
      		int Min=Math.min(s1.length(),s2.length());
                for(int i=0;i<Min;i++){
			char c1=s1.charAt(i);
			char c2=s2.charAt(i);
			if(c1!=c2){
				return c1>c2;
			}
		}
		return s1.length() > s2.length();
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of array");
		int n = scan.nextInt();
		String[] arr = new String[n];
		scan.nextLine();
		for(int i=0;i<n;i++){
			arr[i]=scan.nextLine();
		}
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(isGreater(arr[i],arr[j])){
					String temp = arr[i];
					arr[i] = arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<n;i++){
			System.out.print(arr[i] +" ");
		}
	}
}
