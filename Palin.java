import java.util.Scanner;
public class Palin{
	static boolean isPalindrome(int i,String s,int l){
		if(i>=l/2){
			return true;
		}
		if(s.charAt(i)!=s.charAt(l-i-1)){
			return false;
		}
		return isPalindrome(i+1,s,l);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = sc.nextLine();
		int len = str.length();
		int inp = 0;
		boolean result = isPalindrome(inp,str,len);
		System.out.println(result);
	}
}
