package Collection;

public class Programmer {
	String name;
	String designation;
	boolean ismale;
	String programLang;
	
	
	public Programmer(String name,String designation,boolean ismale,String programLang) {
		this.name=name;
		this.designation=designation;
		this.ismale=ismale;
		this.programLang=programLang;
	}
	
	public String toString() {
		return name +designation+ismale+programLang;
	}

}
