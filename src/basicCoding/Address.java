package basicCoding;

import java.util.Objects;

public class Address implements Comparable<Address>{
	private String streetName;
	private int pinCode;
	public Address(String streetName, int pinCode) {
		super();
		this.streetName = streetName;
		this.pinCode = pinCode;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [streetName=" + streetName + ", pinCode=" + pinCode + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(pinCode, streetName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return pinCode == other.pinCode && Objects.equals(streetName, other.streetName);
	}
	public int compareTo(Address o) {
		
		return this.getPinCode()-o.getPinCode();
	}
	
	

}
