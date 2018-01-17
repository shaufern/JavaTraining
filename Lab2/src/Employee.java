
public class Employee {
	public String mFirstName="";
	public String mLastName="";
	public int mSalary=0;
	public char mGrade='A';
	public Date mDate;
	public int mID=0;
	public static int id=1;
	public static int count=0;
	{
		mID=id++;
		
	}
	Employee(String FirstName,String LastName,int Salary,char Grade,Date date)
	{
		mFirstName=FirstName;
		mLastName=LastName;
		mSalary=Salary;
		mGrade=Grade;
		mDate=date;
		count++;
	}
	
}
