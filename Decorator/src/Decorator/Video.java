package Decorator;

public class Video implements LibraryItem {
	private String title;
	 private int minutes;
	 public Video(String s, int m) {
	 title = s;
	 minutes = m;
	 }
	 public void display() {
	 System.out.println("Title: " + title);
	 System.out.println("Time: " + minutes);
	 }

}
