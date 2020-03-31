import java.util.Scanner;
class Student
{
	private String sName;
	private String lName;
	private double salary;
	private int backLogs;
	private int appearingBackLogs;

	public Student()
	{
		sName = null;
		lName = null;
		salary = 0.0;
		backLogs = 0;
		appearingBackLogs = 0;
	}

	public void setDetails()
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First_Name: ");
		sName = sc.nextLine();
		System.out.print("Enter Last_Name: ");
		lName = sc.nextLine();
		System.out.print("Enter Salary: ");
		salary = sc.nextDouble();
		System.out.print("Enter Number of BackLogs: ");
		backLogs = sc.nextInt();
		System.out.print("Enter AppearingBackLogs: ");
		appearingBackLogs = sc.nextInt();
	}

	public void getDetails()
	{
		System.out.println("First_Name: " +sName);
		System.out.println("Last_Name: " +lName);
		System.out.println("Salary: " +salary);		
	}

	public int getBackLogs()
	{
		return backLogs;
	}

	public int getAppearingBacklogs()
	{
		return appearingBackLogs;
	}

}