package oops;

class Author{
	String name;
	String email;
	char gender;
	
	Author(String name, String email, char gender){
		this.name=name;
		this.email=email;
		this.gender=gender;
	}
	
	public String getName() {
		return name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public char getGender() {
		return gender;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setEmail(String email) {
		this.email=email;
	}
	
	public void setGender(char gender) {
		this.gender=gender;
	}
	
	public String toString() {
		return "Author name: " +name+ "\nEmail: " +email+ "\nGender: " +gender;
	}
}

class Book{
	String name;
	Author author;
	double price;
	int qtyInStock;
	
	Book(String name, Author author, double price, int qtyInStock){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qtyInStock=qtyInStock;
	}
	
	public String getName() {
		return name;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int getQtyInStock() {
		return qtyInStock;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAuthor(Author author) {
		this.author=author;
	}
	
	public void setPrice(double price) {
		this.price=price;
	}
	
	public void setQtyInStock(int qtyInStock) {
		this.qtyInStock=qtyInStock;
	}
	
	public String toString() {
		return "Book name: " +name+ "\n" +author+ "\nPrice: " +price+ "/-" + "\nQuantity in stock: "+qtyInStock;
	}
}

public class Encapsulation_Abstarction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Author a = new Author("Chetan Bhagat", "chetan@example.com", 'M');
	     Book b = new Book("Half Girlfriend", a, 299.99, 100);
	        
	     System.out.println(b);
	        
	}

}
