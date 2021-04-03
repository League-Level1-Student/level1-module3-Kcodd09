package _02_backpack;

public class BackpackRunner {
	public static void main(String[] args) {
		Backpack backpack = new Backpack();
		Ruler ruler = new Ruler();
		Textbook textbook = new Textbook();
		Pencil pencil = new Pencil();
		backpack.putInBackpack(pencil);
		backpack.putInBackpack(textbook);
		backpack.putInBackpack(ruler);
		ruler.measure();
		textbook.read();
		pencil.write("Hi");
		backpack.packAndCheck();
	}
}
