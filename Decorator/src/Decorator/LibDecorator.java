package Decorator;

//Lớp ảo Decorator thư viện
public abstract class LibDecorator implements LibraryItem {
	private LibraryItem libraryitem;
	 public LibDecorator(LibraryItem li) {
	 libraryitem = li;
	 }
	 public void display() {
	 libraryitem.display();
	 }
}
