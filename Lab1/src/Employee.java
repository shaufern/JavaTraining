
public class Employee {
	public String mFirstName="";
	public String mLasstName="";
	public int mSalary=0;
	public char mGrade='A';
	public String mJoiningMth="";
	public int mID=0;
	public static int id=1;
	public static int count=0;
	{
		mID=id++;
		
	}
	Employee(String mFirstName,String mLasstName,int mSalary,char mGrade,String mJoiningMth)
	{
		count++;
	}
	
}
