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
		
		System.out.println("press 1 fot in-Oreder-Traversal and verify result");
		System.out.println("press 2 for post-order-traversal and verify result");
		System.out.println("press 3 for pre-order traversal and verify result");
		int choice = sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				System.out.println("in-Oreder-Traversal");
				treeObj.inOrderTraversal(treeObj.root);
				break;
			}
			case 2:
			{
				System.out.println("\npost-Oreder-Traversal");
				treeObj.postOrderTraversal(treeObj.root);
				treeObj.verifyPostTraversal();
				break;
			}
			case 3:
			{
				System.out.println("\npre-Oreder-Traversal");
				treeObj.preOrderTraversal(treeObj.root);
				break;
			}
		}
	}
}