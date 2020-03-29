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

	public void inOrderTraversal(Node root)
	{
		if(root != null)
		{
			inOrderTraversal(root.left);
			System.out.print(root.data +" ");
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
		}
	}

	public void preOrderTraversal(Node root)
	{
		if(root != null)
		{
			System.out.print(root.data +" ");
			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
			
		}
	}
}