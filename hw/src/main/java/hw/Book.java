package hw;

public class Book {
	private int id;
	private String title;
	private String Author;
	private float price;
	
	public Book(String title, String author, float price, int id) {
		super();
		this.title = title;
		Author = author;
		this.price = price;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
}
