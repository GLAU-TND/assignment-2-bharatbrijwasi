import java.util.Scanner;
class MyMain
{
	public static void main(String[] args)
	{
		MyCircularQueue obj = new MyCircularQueue();
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of Nodes to be inserted: ");
		int numberNodes = sc.nextInt();
		for(int i = 1; i <= numberNodes; i++)
		{
			System.out.println("-----+------" +i+ "-------+---------");
			obj.enQueue();
		}

		obj.displayQueue();

		obj.removeElement();
		obj.displayQueue();
	}
}