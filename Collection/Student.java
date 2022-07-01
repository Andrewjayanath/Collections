package Collection;

public class Student {
	private String name;
	private int id;
	private int fees;
	private boolean ismale;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
		
	}
	public int getFees() {
		return fees;
	}
	public void setFess(int fees) {
		this.fees=fees;
	}
	public boolean getIsmale() {
		return ismale;
	}
	public void setIsmale(boolean ismale) {
		this.ismale=ismale;
	}
	public Student(String name,int id,int fees,boolean ismale) {
		this.name=name;
		this.id=id;
		this.fees=fees;
		this.ismale=ismale;
	}
	public String toString() {
		return name+id+fees+ismale;
	}

}
