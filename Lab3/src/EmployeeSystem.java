import java.util.ArrayList;

public class EmployeeSystem {
	
	private class PermanentEmployee extends Employee
	{
		public int mSalary=0;
		PermanentEmployee(String FirstName,String LastName,int Salary,char Grade,Date date)
		{
			super(FirstName,LastName,Grade,date);
			mSalary=Salary;
			mType=Employee.EmployeeType.PERMANENT;
		}
	}
	
	public ArrayList<PermanentEmployee> mPermanentEmployeeList=new ArrayList<PermanentEmployee>();
	public ArrayList<Contractor> mContractorList=new ArrayList<Contractor>();
	
	public void AddContractEmployee(String FirstName,String LastName, int Rate,int Hr, char Grade, Date date, String contractor)
	{
		int idx;
		for(idx=0;idx<mContractorList.size();++idx)
		{
			if(mContractorList.get(idx).mContractorName==contractor)
			{
				mContractorList.get(idx).AddContractEmployee(FirstName, LastName, Rate, Hr, Grade, date);
				return;
			}		
		}
		if(idx==mContractorList.size())
		{
			mContractorList.add(new Contractor(contractor));
			mContractorList.get(idx).AddContractEmployee(FirstName, LastName, Rate, Hr, Grade, date);
		}
	}
	public void AddPermanentEmployee(String FirstName,String LastName, int salary, char Grade, Date date)
	{
		mPermanentEmployeeList.add(new PermanentEmployee(FirstName, LastName, salary, Grade,date));
	}
	public void AddContractor(String contractorName)
	{
		mContractorList.add(new Contractor(contractorName));
	}
	public void PrintEmployeeCount()
	{
		System.out.println("Total Permanent Employee: "+mPermanentEmployeeList.size());
		int ContractCount=0;
		for(Contractor c: mContractorList)
		{
			int count=c.GetEmployeeCount();
			ContractCount+=count;
			System.out.println("\tUnder Contractor "+c.mContractorName+": "+count);
			for(int i=0;i<count;++i)
			{
				System.out.println("\t\t"+c.mContractEmployeeList.get(i).toString());
			}
		}
		System.out.println("Total Contract Employee: "+ContractCount);
		
		
	}
}
