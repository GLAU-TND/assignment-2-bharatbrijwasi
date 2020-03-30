import java.util.ArrayList; 
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

	ArrayList<Integer> list = new ArrayList<Integer>(); 

	public void inOrderTraversal(Node root)
	{
		if(root != null)
		{
			inOrderTraversal(root.left);
			System.out.print(root.data +" ");
 			inOrderTraversal(root.right);
 			list.add(root.data); 

		}
	}

	public void postOrderTraversal(Node root)
	{
		if(root != null)
		{
			postOrderTraversal(root.left);
			postOrderTraversal(root.right);
			System.out.print(root.data +" ");
			list.add(root.data);
			 
		}
	}

	public void preOrderTraversal(Node root)
	{
		if(root != null)
		{
			System.out.print(root.data +" ");
			list.add(root.data);
 			preOrderTraversal(root.left);
			preOrderTraversal(root.right);
			
		}
	}

	public boolean verifyPreOrderTraversal()
	{ 
		//if first Value of Arraylist is Equal to first value(root value) it return true, means preOrder varify
		return(root.data == list.get(0));	 
	}


	public boolean verifyInOrderTraversal()
	{ 
		//if (half or half+1) Value of Arraylist is Equal to first value(root value) it return true, means preOrder varify
		return(root.data == (list.size()/2) || root.data == (list.size()/2)+1);	 
	}

	public boolean verifyPostOrderTraversal()
	{ 
		//if last Value of Arraylist is Equal to first value(root value) it return true, means preOrder varify
		return(root.data == list.size() - 1);	 
	}
}