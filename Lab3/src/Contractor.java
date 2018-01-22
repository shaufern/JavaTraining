import java.util.ArrayList;

public class Contractor {
	public String mContractorName="";
	public ArrayList<ContractEmployee> mContractEmployeeList=new ArrayList<ContractEmployee>();
	
	Contractor(String Name)
	{
		mContractorName=Name;
	}
	public class ContractEmployee extends Employee
	{
		public int mRate=0;
		public int mHours=0;
		
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
		public String toString()
		{
			String s=super.toString();
			s+=(" Rate: "+mRate+" Hours: "+mHours+"\n");
			return s;
		}
	}
	public void AddContractEmployee(String FirstName,String LastName, int Rate,int Hr, char Grade, Date date)
	{
		mContractEmployeeList.add(new ContractEmployee(FirstName,LastName,Rate,Hr,Grade,date,mContractorName));
		
	}
	public int GetEmployeeCount()
	{
		return mContractEmployeeList.size();
	}
}
