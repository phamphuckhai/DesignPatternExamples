package Decorator;

public class Book implements LibraryItem {
	private String title;
	 private int page;
	 public Book(String s, int p) {
	 title = s;
	 page = p;
	 }
	 public void display() {
	 System.out.println("Title: " + title);
	 System.out.println("Page number: " + page);
	 }
}
