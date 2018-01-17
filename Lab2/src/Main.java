import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {

		ArrayList<Employee> mEmployeeIDList=new ArrayList<Employee>();
		System.out.println("Total Employees: "+Employee.count);	
		Employee E0=new Employee("Tom0", "Smith", 13000, 'A',new Date(1,1,2012));
		mEmployeeIDList.add(E0);
		Employee E1=new Employee("Tom1", "Smith", 13023, 'A',new Date(15,2,2044));
		mEmployeeIDList.add(E1);
		Employee E2=new Employee("Tom2", "Smith", 13043, 'A',new Date(14,3,2033));
		mEmployeeIDList.add(E2);
		Employee E3=new Employee("Tom3", "Smith", 13030, 'A',new Date(1,4,2056));
		mEmployeeIDList.add(E3);
		Employee E4=new Employee("Tom4", "Smith", 13040, 'A',new Date(2,5,2022));
		mEmployeeIDList.add(E4);
		Employee E5=new Employee("Tom5", "Smith", 13070, 'A',new Date(3,6,2011));
		mEmployeeIDList.add(E5);
		Employee E6=new Employee("Tom6", "Smith", 13090, 'A',new Date(13,7,2022));
		mEmployeeIDList.add(E6);
		Employee E7=new Employee("Tom7", "Smith", 13123, 'A',new Date(12,8,2034));
		mEmployeeIDList.add(E7);
		Employee E8=new Employee("Tom8", "Smith", 13323, 'A',new Date(11,9,2023));
		mEmployeeIDList.add(E8);
		System.out.println("Total Employees: "+Employee.count);
		System.out.println("Employees ID: ");
		for(Employee e:mEmployeeIDList)
		{
			System.out.print(e.mID+" ");
			
		}
		System.out.print("EI's ID: "+E1.mID);
	}

}
