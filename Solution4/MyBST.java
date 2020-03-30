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
}