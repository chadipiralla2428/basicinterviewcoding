package basicCoding;

import java.util.Objects;

public class Patient {
	private String name;
	private int age;
	private String deseaseName;
	private int bill;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDeseaseName() {
		return deseaseName;
	}
	public void setDeseaseName(String deseaseName) {
		this.deseaseName = deseaseName;
	}
	public int getBill() {
		return bill;
	}
	public void setBill(int bill) {
		this.bill = bill;
	}
	public Patient(String name, int age, String deseaseName, int bill) {
		super();
		this.name = name;
		this.age = age;
		this.deseaseName = deseaseName;
		this.bill = bill;
	}
	public Patient() {
		super();
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, bill, deseaseName, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Patient other = (Patient) obj;
		return age == other.age && bill == other.bill && Objects.equals(deseaseName, other.deseaseName)
				&& Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Patient [name=" + name + ", age=" + age + ", deseaseName=" + deseaseName + ", bill=" + bill + "]";
	}
	
	

}
