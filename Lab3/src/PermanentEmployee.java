
public class PermanentEmployee extends Employee
{
	public int mSalary=0;
	public static int count=0;
	PermanentEmployee(String FirstName,String LastName,int Salary,char Grade,Date date)
	{
		super(FirstName,LastName,Grade,date);
		mSalary=Salary;
		mType=Employee.EmployeeType.PERMANENT;
		count++;
	}
}
