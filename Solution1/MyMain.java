import java.util.Scanner;
class MyMain
{
	public static void main(String[] args)
	{
		MyBST obj = new MyBST();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Nodes to be inserted into Binary Search Tree:");
		int inputChoice = sc.nextInt();
		for(int i = 1; i <= inputChoice; i++)
		{
			obj.addNode(sc.nextInt());
		}

		System.out.print("Left Nodes of Tree are: ");
	    obj.printLeftNode(obj.root);
	    System.out.println("\nNode that not have left child: " +obj.getCount());
	}
}