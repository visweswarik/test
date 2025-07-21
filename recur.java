import java.util.Scanner;
public class recur{
	static String Reverse(String STR1,int strt,int length,String remaining){
		remaining ="";
		if(strt>=length){
			return "";
		}
		else{
			while(strt<length && STR1.charAt(strt)!=' '){
				remaining+=(STR1.charAt(strt));
			        strt++;
			}
			return Reverse(STR1,strt+1,length,remaining)
+ " " + remaining;
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scan.nextLine();
		int len = str.length();
		int start = 0;
		String remain="";
		System.out.println(Reverse(str,start,len,remain));
	}
}
