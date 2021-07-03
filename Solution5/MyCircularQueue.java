class MyCircularQueue
{
	QNode rear;
	QNode front;

	public MyCircularQueue()
	{
		rear = null;
		front = null;
	}

	public void enQueue()
	{
		Student newStudent = new Student();
		newStudent.setDetails();
		QNode newnode = new QNode(newStudent);

		if(rear == null && front == null)
		{
			rear = newnode;
			front = newnode;
		}

		else
		{
			rear.next = newnode;
		}
		rear = newnode;
		rear.next = front;
	}

	public void removeElement()
	{
		if(front == null)
		{
			System.out.println("Queue is Empty");
		}

		QNode temp = front;
		if(front == rear)	//if Queue has One Element
		{
			if((temp.st.getBackLogs() - temp.st.getAppearingBacklogs()) == 0)
			{
				front = rear = null;
				System.out.println("Element Deleted...");
			}
			else
			{
				System.out.println("Can.t delete");
			}
		}
		else
		{
			if((temp.st.getBackLogs() - temp.st.getAppearingBacklogs()) == 0)
			{
				front = front.next;
				rear.next = front;
				System.out.println("Element Deleted...");
			}
		}

	}

	public void displayQueue()
	{ 
			QNode temp = front;
			System.out.println();
			while(temp.next != front)
			{
				System.out.println();
				temp.st.getDetails();
				System.out.print("BackLogs: " +temp.st.getBackLogs());
				System.out.print("\nAppearing BackLogs: " +temp.st.getAppearingBacklogs());
				temp = temp.next;
			}
			temp.st.getDetails();
			System.out.print("BackLogs: " +temp.st.getBackLogs());
			System.out.print("\nAppearing BackLogs: " +temp.st.getAppearingBacklogs());
	}
}