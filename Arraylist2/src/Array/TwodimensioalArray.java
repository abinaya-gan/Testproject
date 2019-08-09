package Array;
import java.util.Scanner;
public class TwodimensioalArray {

	public static void main(String[] args) {
		int row,col,i,j;
		int arr[][] = new int[10][10];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		row = scan.nextInt();
		System.out.println("Enter the number of columns");
		col=scan.nextInt();
		System.out.println("Enter the  number" + (row*col)+ "in array");
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++) 
			{
				arr[i][j] = scan.nextInt();
				
			}
		}
		
		System.out.println("Enter the array");
		for(i=0; i<row; i++)
		{
			for(j=0; j<col; j++)
			{
				System.out.println(arr[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
