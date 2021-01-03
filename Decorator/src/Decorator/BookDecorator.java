package Decorator;

//Các lớp Decorator cho mỗi tài liệu thư viện cần bổ sung trách nhiệm ở thời điểm run-time
public class BookDecorator extends LibDecorator {
	private String borrower;
	 public BookDecorator(LibraryItem li, String b) {
	 super(li);
	 borrower = b;
	 }
	 public void display() {
	 super.display();
	 System.out.println("Borrower: " + borrower);
	 }
}
