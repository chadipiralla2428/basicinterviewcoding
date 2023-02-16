package basicCoding;

import java.util.Objects;

public class Employee1 {
	private int id;
	private int age;
	private String name;
	private Address address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public Employee1(int id, int age, String name, Address address) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.address = address;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", age=" + age + ", name=" + name + ", address=" + address + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, age, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee1 other = (Employee1) obj;
		return Objects.equals(address, other.address) && age == other.age && id == other.id
				&& Objects.equals(name, other.name);
	}
	

}
