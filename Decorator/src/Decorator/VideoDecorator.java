package Decorator;

public class VideoDecorator extends LibDecorator {
	public VideoDecorator(LibraryItem li) {
		 super(li);
		 }
		 public void display() {
		 super.display();
		 System.out.println("Play video!!!");
		//phương thức play video
		 }
}
