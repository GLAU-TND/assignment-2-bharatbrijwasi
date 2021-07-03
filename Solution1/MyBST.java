class MyBST
{
	Node root;
	public MyBST()
	{
		root = null;
	}

	public void addNode(int newdata)
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

	int count = 0; //count to count the node that does not have left node
	public void printLeftNode(Node root)
	{
        if(root == null)  
        {
        	return;
        }
        else
        {
            if(root.left!=null) 
            {
            	System.out.print(root.left.data +" ");
            }
            else
            {
                count++;
            }
            printLeftNode(root.left);
            printLeftNode(root.right);
        }
    }

    public int getCount()
    {
    	return count;
    }
}