package ex_241022_ch4_2.homework;

public class Kjh0313_parents {
	protected String name;
	protected int price;
	protected String color[];

	public Kjh0313_parents(String name, int price, String[] color) {
		super();
		this.name = name;
		this.price = price;
		this.color = color;
	}

	public void introduce() {
		System.out.println("역할군: " + name + "\n최종DPS(단일기준): " + price);
		System.out.print("포지션: ");
		for (int i = 0; i < color.length; i++) {
			System.out.print(color[i] + " ");
		}
	}
}