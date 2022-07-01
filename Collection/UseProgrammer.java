package Collection;

import java.util.ArrayList;

public class UseProgrammer {
	public static void main(String[]args) {
		Programmer pro1=new Programmer("Sakthi","Tl",true,"C++");
		Programmer pro2=new Programmer("Anand","temp",true,"java");
		Programmer pro3=new Programmer("Lavina","permanent",false,"Pytho");
		Programmer pro4=new Programmer("Anto","Senior",true,"javaScript");
		Programmer pro5=new Programmer("Santhosh","Manager",true,"Html");
		ArrayList<Programmer>pros=new ArrayList<>();
		pros.add(pro1);
		pros.add(pro2);
		pros.add(pro3);
		pros.add(pro4);
		pros.add(pro5);
		pros.forEach((i)->{System.out.println(i);});
		String all="";
		for(int i=0;i<pros.size();i++) {
			all=all+pros.get(i).name;
		}
			System.out.println(all);	
		
			
	
		}
			
			
			
			
			
			
		}
	


