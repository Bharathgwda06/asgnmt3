package prb2;
import prb2.Author;

public class Book {
	private String name;
	private Author author;
	private double price;
	private int qty=0;
	
	Book(String name , Author author , double price){
		this.name=name;
		this.author=author;
		this.price=price;
	}
	
	public Book(String name , Author author , double price , int qty){
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty = qty;
	}
	
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author.toString();
	}
	public double getprice() {
		return price;
	}
	public void setPrice(double p) {
		this.price=p;
	}
	
	public int getQty() {
		return qty;
	}
	public void setqty(int q) {
		qty=q;
	}
	

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", qty=" + qty + ", getAuthor()=" + getAuthor() + "]";
	}

	public static void main(String[] args) {
		
		
		
		
		

	}

}
