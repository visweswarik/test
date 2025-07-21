import java.util.Scanner;
public class Grid{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the rows");
		int row = scan.nextInt();
		System.out.println("Enter the columns");
		int col = scan.nextInt();
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				System.out.print("-");
			}
			System.out.println();
		}
	}
}
