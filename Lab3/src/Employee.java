

public class Employee {
	public enum EmployeeType
	{
		PERMANENT,
		CONTRACT
	}
	public EmployeeType mType;
	
	public String mFirstName="";
	public String mLastName="";
	public char mGrade='A';
	public Date mDate;
	public int mID=0;
	public static int id=1;

	{
		mID=id++;
	}
	Employee(String FirstName,String LastName,char Grade,Date date)
	{
		mFirstName=FirstName;
		mLastName=LastName;
		mGrade=Grade;
		mDate=date;
	}
	
}
