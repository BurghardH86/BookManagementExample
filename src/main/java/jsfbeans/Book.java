package jsfbeans;

public class Book {
	
	private String author;
	private String name;
	private String publishDate;
	private String price;
	private String[] emailAdresses;
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String[] getEmailAdresses() {
		return emailAdresses;
	}
	public void setEmailAdresses(String[] emailAdresses) {
		this.emailAdresses = emailAdresses;
	}

}
