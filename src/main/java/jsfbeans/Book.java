package jsfbeans;

import java.util.LinkedHashMap;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@RequestScoped
public class Book {
	
	private String author;
	
	private String name;
	
	private String publishDate;
	
	private String price;
	
	private String[] emailAddresses;
	
	private String language = "de";
	
	private static LinkedHashMap<String, String> languages;
	
	static {
		languages = new LinkedHashMap<>();
		languages.put("Deutsch", "de");
		languages.put("Englisch", "en");
		languages.put("Italienisch", "it");
		languages.put("Koreanisch", "kr");
		
	}
	
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public LinkedHashMap<String, String> getLanguages() {
		return languages;
	}
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
	public String[] getEmailAddresses() {
		return emailAddresses;
	}
	public void setEmailAddresses(String[] emailAddresses) {
		this.emailAddresses = emailAddresses;
	}
	
	public String save() {
		//TODO: Abspeichern
		return "index";
	}
	
	public void saveListener(ActionEvent e) {
		System.out.println("Abteilungen benachrichtigen: " + java.util.Arrays.toString(this.emailAddresses));
	}
	
	public void emailAddressChanged(ValueChangeEvent e) {
		System.out.println("Adressen haben sich ge�ndert " + java.util.Arrays.toString((String[])e.getNewValue()));
	}

}
