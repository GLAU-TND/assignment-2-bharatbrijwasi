import java.util.Scanner;
class Student
{
 	private String sName;
	private String lName;
	private double salary;

	public Student()
	{
		sName = null;
		lName = null;
		salary = 0.0;
	} 

	public void setStudentDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First_Name: ");
		sName = sc.nextLine();
		System.out.print("Enter Last_name: ");
		lName = sc.nextLine();
		System.out.print("Enter Salary: ");
		salary = sc.nextDouble();
	}

	public String getSname()
	{
		return sName;
	}

	public String getLname()
	{
		return lName;
	}

	public double getSalary()
	{
		return salary;
	}

}