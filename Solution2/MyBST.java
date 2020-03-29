import java.util.LinkedList; 
import java.util.Queue; 
import java.util.Scanner;
class MyBST
{
	Node root;
	public MyBST()
	{
		root = null;
	}

	public void insertNode(int newdata)
	{
		Node newnode = new Node(newdata);
		if(root == null)
		{
			root = newnode;
		}

		else
		{
			Node present = root;
			Node parent = null;

			while(true)
			{
				parent = present;
				if(present.data > newdata)
				{
					present = present.left;
					{
						if(present == null)
						{
							parent.left = newnode;
							return;
						}
					}
				}

				else
				{
					present = present.right;
					if(present == null)
					{
						parent.right = newnode;
						return;
					}
				}
			}
		}

	}

	Queue<Integer> q = new LinkedList<>(); 

	/*implement Queue interface to hold element of each traversal it also help to varify the result of each traversal*/
	//if queue head equal to root means pre-order-traversal verify
	//if queue peak equal to root means post-order-traversal varify
	//

	public void inOrderTraversal(Node root)
	{
		if(root != null)
		{
			inOrderTraversal(root.left);
			System.out.print(root.data +" ");
			q.add(root.data);	//we pushed every element into queue(using Queue predefine interface) to varify the result
			inOrderTraversal(root.right);
		}
	}

	public void postOrderTraversal(Node root)
	{
		if(root != null)
		{
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.data +" ");
			q.add(root.data); //we pushed every element into queue(using Queue predefine interface) to varify the result
		}
	}

	public void preOrderTraversal(Node root)
	{
		if(root != null)
		{
			System.out.print(root.data +" ");
			q.add(root.data);	//we pushed every element into queue(using Queue predefine interface) to varify the result
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
			
		}
	}

	public void verifyPostTraversal()
	{
		System.out.println(q);
		System.out.println(root.data);
		if(q.peek() == root.data)
		{
			System.out.println("post-order-traversal verified....");
		}


	}
}