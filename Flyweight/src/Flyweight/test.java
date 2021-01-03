package Flyweight;

import java.util.ArrayList;

public class test {
	public static void main(String[] agrs) {
		CharacterFactory characterfactory = new CharacterFactory();
		ArrayList<Character> text = new ArrayList<Character>();
		text.add(0, characterfactory.get("a", "arial"));
		text.add(1, characterfactory.get("b", "time"));
		text.add(2, characterfactory.get("a", "arial"));
		text.add(0, characterfactory.get("c", "arial"));
		for (int i = 0; i < text.size(); i++) {
			Character c = (Character) text.get(i);
			c.draw();
		}
	}
}
//Như vậy ‘a’ + ‘arial’ gọi 2 lần như chỉ khởi tạo có 1 lần mà thôi
