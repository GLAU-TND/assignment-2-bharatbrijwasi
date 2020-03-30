import java.util.ArrayList; 
import java.util.Scanner;
class MyMain
{
	public static void main(String[] args)
	{
		MyBST treeObj = new MyBST();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number of Node insert into Binary-Search-Tree: ");
		int inputNode = sc.nextInt();
		for(int i = 1; i <= inputNode; i++)
		{
			System.out.print(i+ "-Node Value: ");
			treeObj.insertNode(sc.nextInt());	
		}
 			
		System.out.println("press 1 for Pre-Order-Traversal");
		System.out.println("press 2 for in-Order-Traversal");
		System.out.println("press 3 for Post-Order_traversal");
		int inputChoice = sc.nextInt();
		switch(inputChoice)
		{
			case 1:
			{
				System.out.println("\npre-Order-Traversal");
				treeObj.preOrderTraversal(treeObj.root);
				break;
			}
			case 2:
			{
				System.out.println("in-Order-Traversal");
				treeObj.inOrderTraversal(treeObj.root);
				break;
			}
			case 3:
			{
				System.out.println("\npost-Order-Traversal");
				treeObj.postOrderTraversal(treeObj.root);
				break;
			}
		}
		
		//verify result 
		System.out.println("\nPre-Order_traversal Verify: " +treeObj.verifyPreOrderTraversal());
		System.out.println("Post-Order_traversal Verify: " +treeObj.verifyPostOrderTraversal());
		System.out.println("In-Order_traversal Verify: " +treeObj.verifyInOrderTraversal());

	}
}