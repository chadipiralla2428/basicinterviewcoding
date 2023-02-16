package StreamsConcepts;

import java.util.Objects;

public class Products {
	private int id;
	private String lang;
	private String prod;
	private int price;
	public Products() {
		super();
	}
	public Products(int id, String lang, String prod, int price) {
		super();
		this.id = id;
		this.lang = lang;
		this.prod = prod;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String getProd() {
		return prod;
	}
	public void setProd(String prod) {
		this.prod = prod;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, lang, price, prod);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Products other = (Products) obj;
		return id == other.id && Objects.equals(lang, other.lang) && price == other.price
				&& Objects.equals(prod, other.prod);
	}
	@Override
	public String toString() {
		return "ProductsDemo [id=" + id + ", lang=" + lang + ", prod=" + prod + ", price=" + price + "]";
	}
	

}
