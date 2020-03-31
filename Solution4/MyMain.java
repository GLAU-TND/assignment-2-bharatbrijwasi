import java.util.Scanner;
class MyMain
{
	public static void main(String[] args)
	{
		MyBST obj = new MyBST();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of Nodes to be inserted into Binary Search Tree:");
		int numberOfNodeInTree = sc.nextInt();
		for(int i = 1; i <= numberOfNodeInTree; i++)
		{
			System.out.print(i+ "-Node: ");
			obj.insertNode(sc.nextInt());
		}


		MyQueue obj1 = new MyQueue();
 	
		obj1.preOrderSucc(obj.root);
        System.out.print("Pre-Order Successor of all the nodes are: ");
        obj1.dispPreOrderSucc();
	}
}