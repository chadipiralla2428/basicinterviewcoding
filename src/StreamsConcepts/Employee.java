package StreamsConcepts;

import java.util.Objects;

public class Employee {
	private String name;
	private String city;
	public Employee() {
		super();
	}
	public Employee(String name, String city) {
		super();
		this.name = name;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(city, name);
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
		return Objects.equals(city, other.city) && Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", city=" + city + "]";
	}
	

}
