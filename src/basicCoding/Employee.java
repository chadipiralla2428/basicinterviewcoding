package basicCoding;

import java.util.Objects;

public class Employee {
	private int age;
	private String name;
	private Double sal;
	@Override
	public String toString() {
		return "Employee [age=" + age + ", name=" + name + ", sal=" + sal + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name, sal);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(sal, other.sal);
	}
	public Employee() {
		super();
	}
	public Employee(int age, String name, Double sal) {
		super();
		this.age = age;
		this.name = name;
		this.sal = sal;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}

}
