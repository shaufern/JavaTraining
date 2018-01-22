import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {

		EmployeeSystem es=new EmployeeSystem();
		es.PrintEmployeeCount();
		
		es.AddPermanentEmployee("Tom0", "Smith", 13000, 'A',new Date(1,1,2012));
		es.AddPermanentEmployee("Tom1", "Smith", 13023, 'A',new Date(15,2,2044));
		es.AddContractEmployee("Tom2", "Smith", 12,8, 'A',new Date(14,3,2033),"XiaoMing");
		es.AddPermanentEmployee("Tom3", "Smith", 120000, 'A',new Date(1,4,2056));
		es.AddContractEmployee("Tom4", "Smith", 12,8, 'A',new Date(2,5,2022),"XiaoLiaon");
		es.AddPermanentEmployee("Tom5", "Smith", 1280, 'A',new Date(3,6,2011));
		es.AddContractEmployee("Tom6", "Smith", 12,8, 'A',new Date(13,7,2022),"AhLong");
		es.AddPermanentEmployee("Tom7", "Smith", 2300, 'A',new Date(12,8,2034));
		es.AddContractEmployee("Tom8", "Smith", 13,5, 'A',new Date(11,9,2023),"AhMao");
	
		es.PrintEmployeeCount();
	}

}
