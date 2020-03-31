class MyQueue
{
	QNode rear;
	QNode front;

	public MyQueue()
	{
		this.front = null;
		this.rear = null;
	}

	public void enQueue(int data)
	{
		QNode newnode = new QNode(data);
 
		if(front == null && rear == null)
		{
			front = newnode;
			rear = newnode;
		}
		else
		{
			rear.next = newnode;
			rear = newnode;
		}
	}


	public void preOrderSucc(Node root)
	{
        if(root!=null)
        {
            enQueue(root.data);
            preOrderSucc(root.left);
            preOrderSucc(root.right);
        }
    }

     public void dispPreOrderSucc()
     {
        QNode temp = front.next;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}