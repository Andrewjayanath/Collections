package Collection;

import java.util.ArrayList;

public class UseStudent {
	public static void main(String[]args) {
		Student stu1=new Student("arun",234,5000,true);
		Student stu2=new Student("arjun",345,7000,true);
		Student stu3=new Student("Ruby",435,8000,false);
		Student stu4=new Student("geetha",675,9000,false);
		Student stu5=new Student("measa",786,1000,true);
		Student stu6=new Student("pavithra",657,12000,false);
		ArrayList<Student>stus=new ArrayList<>();
		stus.add(stu1);
		stus.add(stu2);
		stus.add(stu3);
		stus.add(stu4);
		stus.add(stu5);
		stus.add(stu6);
		ArrayList<Student>maleStudents=new ArrayList<>();
		ArrayList<Student>femaleStudents=new ArrayList<>();
		stus.forEach((i)->{
			if(i.getIsmale()) {
				maleStudents.add(i);
			}else {
				femaleStudents.add(i);
			}});
		for(Student i:maleStudents) {
			System.out.println(i);
				
			}

		
	}

}
