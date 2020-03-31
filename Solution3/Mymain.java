import java.util.Scanner;
public class Mymain
{
	public static void main(String[] args)
	{
		MyPriorityQueue prty = new MyPriorityQueue();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Records: ");
		int inputStudent = sc.nextInt();
		for(int i = 1; i <= inputStudent; i++)
		{
			prty.enQueue();
		}
		System.out.println();
		prty.printQueue();
	}
}