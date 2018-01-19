
public class ContractEmployee extends Employee
{
	public int mRate=0;
	public int mHours=0;
	public static int count=0;
	public String mContractor;
	ContractEmployee(String FirstName,String LastName,int rate,int hours,char Grade,Date date,String Contractor)
	{
		super(FirstName,LastName,Grade,date);
		mRate=rate;
		mHours=hours;
		mType=Employee.EmployeeType.CONTRACT;
		mContractor=Contractor;
		count++;
	}
}
