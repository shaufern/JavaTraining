import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {

		ArrayList<Employee> mEmployeeIDList=new ArrayList<Employee>();
		System.out.println("Total PermanentEmployee Employees: "+PermanentEmployee.count);
		System.out.println("Total ContractEmployee Employees: "+ContractEmployee.count);
		
		Employee E0=new PermanentEmployee("Tom0", "Smith", 13000, 'A',new Date(1,1,2012));
		mEmployeeIDList.add(E0);
		Employee E1=new PermanentEmployee("Tom1", "Smith", 13023, 'A',new Date(15,2,2044));
		mEmployeeIDList.add(E1);
		Employee E2=new ContractEmployee("Tom2", "Smith", 12,8, 'A',new Date(14,3,2033),"XiaoMing");
		mEmployeeIDList.add(E2);
		Employee E3=new PermanentEmployee("Tom3", "Smith", 120000, 'A',new Date(1,4,2056));
		mEmployeeIDList.add(E3);
		Employee E4=new ContractEmployee("Tom4", "Smith", 12,8, 'A',new Date(2,5,2022),"XiaoLiaon");
		mEmployeeIDList.add(E4);
		Employee E5=new PermanentEmployee("Tom5", "Smith", 1280, 'A',new Date(3,6,2011));
		mEmployeeIDList.add(E5);
		Employee E6=new ContractEmployee("Tom6", "Smith", 12,8, 'A',new Date(13,7,2022),"AhLong");
		mEmployeeIDList.add(E6);
		Employee E7=new PermanentEmployee("Tom7", "Smith", 2300, 'A',new Date(12,8,2034));
		mEmployeeIDList.add(E7);
		Employee E8=new ContractEmployee("Tom8", "Smith", 13,5, 'A',new Date(11,9,2023),"AhMao");
		mEmployeeIDList.add(E8);
		
		System.out.println("Total PermanentEmployee Employees: "+PermanentEmployee.count);
		System.out.println("Total ContractEmployee Employees: "+ContractEmployee.count);	
		
		System.out.print("E8's Contactor: "+((ContractEmployee)E8).mContractor);
	}

}
