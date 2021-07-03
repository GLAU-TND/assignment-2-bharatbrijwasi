class Node
{
	Student st; 
	Node next;
	int priotry;	//here priority work as roll number of student
	public Node(Student st, int priotry)
	{
		this.st = st;
		next = null;
		this.priotry = priotry; 
	}

}