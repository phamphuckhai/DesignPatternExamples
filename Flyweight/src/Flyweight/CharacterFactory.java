package Flyweight;

import java.util.Hashtable;

//Lớp khởi tạo các kí tự theo symbol và font, mỗi lần khởi tạo nó sẽ lưu các đối tượng này
//vào vùng nhớ riêng của nó, nếu đối tượng ký tự symbol + font đã có thì nó sẽ lấy ra chứ không
//khởi tạo lại
public class CharacterFactory {
	private Hashtable<String, Character> pool = new Hashtable<String, Character>();
	public int getNum() {
	return pool.size();
	}
	public Character get(String symbol, String fontFace) {
		Character c;
		String key = symbol + fontFace;
		if ((c = (Character)pool.get(key)) != null) {
		 return c;
	} else {
			 c = new ConcreteCharacter(symbol, fontFace);
			 pool.put(key, c);
			 return c;
			 }
	}
}
