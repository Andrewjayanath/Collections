package Collection;

import java.util.ArrayList;

public class UseEmployee {
	public static void main(String[]args) {
		ArrayList<Employee>employees=new ArrayList<>();
		Employee emp=new Employee();
		emp.name="Ram";
		emp.id=236;
		emp.gender="male";
		emp.salary=10000;
		
		Employee emp1=new Employee();
		emp1.name="Raghu";
		emp1.id=237;
		emp1.gender="female";
		emp1.salary=12000;
		
		Employee emp2=new Employee();
		emp2.name="Karthi";
		emp2.id=987;
		emp2.gender="male";
		emp2.salary=25000;
		
		Employee emp3=new Employee();
		emp3.name="melvin";
		emp3.id=123;
		emp3.gender="male";
		emp3.salary=30000;
		
		Employee emp4=new Employee();
		emp4.name="Mano";
		emp4.id=475;
		emp4.gender="male";
		emp4.salary=15000;
		
		employees.add(emp);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		
		//for(int i=0;i<employees.size();i++) {
			//System.out.println(employees.get(i));
		//	System.out.println(employees.get(i).name+employees.get(i).id+employees.get(i).gender+employees.get(i).salary);
			
			//}
		//for(Employee i:employees) {
			//System.out.println(i.name+i.id);
		employees.forEach((i)->{System.out.println(i.name+i.id);});
			
		}
		}
		
	


