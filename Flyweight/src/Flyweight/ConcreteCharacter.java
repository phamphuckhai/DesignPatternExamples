package Flyweight;

public class ConcreteCharacter implements Character {
	 private String symbol;
	 private String font;
	 public ConcreteCharacter(String s, String f) {
	 this.symbol = s;
	 this.font = f;
	 }
	 public void draw() {
	 System.out.println("Symbol " + this.symbol + " with font " + this.font);
	 }

}


