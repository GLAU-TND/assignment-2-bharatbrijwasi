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
		
		System.out.println("in-Oreder-Traversal");
		treeObj.inOrderTraversal(treeObj.root);
		
		System.out.println("\npost-Oreder-Traversal");
		treeObj.postOrderTraversal(treeObj.root);

		System.out.println("\npre-Oreder-Traversal");
		treeObj.preOrderTraversal(treeObj.root);
		
	}
}