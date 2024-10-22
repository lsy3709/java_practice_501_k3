package ex_241022_ch4_2.homework;

public class Lsh1208_homework_parents {
	protected String name;
	protected int price;
	protected String color[];

	public Lsh1208_homework_parents(String name, int price, String[] color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}

	public void introduce() {
		System.out.println("핸드폰 기종: " + name + "\n가격: " + price);
		System.out.print("색상: ");
		for (int i = 0; i < color.length; i++) {
			System.out.print(color[i] + " ");
		}
	}
}
