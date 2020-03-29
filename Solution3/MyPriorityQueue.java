import java.util.Scanner;
class MyPriorityQueue
{
	Node head;	//Front for deleting but in this problem it Contain first Node. 
	Node rear; //rear for insrting new node.

	public MyPriorityQueue()
	{
		head = null;
		rear = null;
	}

	public void enQueue()
	{
		Scanner sc = new Scanner(System.in);
		Student newStudent = new Student();
		System.out.print("Enter Student Roll Number(Priority)");
		int newStudentPriority = sc.nextInt();
		//user first Enter rollnumber after he enter All other details
		Node newnode = new Node(newStudent, newStudentPriority);	
		newStudent.setStudentDetails();
 
		//if list is Empty
		if(rear == null && head == null)
		{
			rear = newnode;
			head = newnode;
		}

		else
		{
			//if head ki priority greater h new student ki prority se
			if(head.priotry > newStudentPriority)
			{
				newnode.next = head;
				head = newnode;
				rear = newnode;
			}

			else
			{
				Node temp = head;
				Node previous = null;
				while(temp.next != null && temp.next.priotry < newStudentPriority)
				{ 
					temp = temp.next;
				} 
				newnode.next = temp.next;
				temp.next = newnode;
			}
		}
	}

	public void printQueue()
	{
		if(head == null)
		{
			System.out.println("No record found...");
		}

		else
		{
			Node temp = head;
			while(temp != null)
			{
				System.out.println("-----+--------+----------");
				System.out.println("Roll Number(Priority): " +temp.priotry);
				System.out.println("First_Name: " +temp.st.getSname());
				System.out.println("LAst_name: ");
				System.out.println("Salary: ");
				System.out.println("-----+--------+----------");
				temp = temp.next;
			}
		}
	}
}