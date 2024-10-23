package ex_241022_ch4_2.homework;

public class Kjh0313_child extends Kjh0313_parents {
	public Kjh0313_child(String name, int price, String color[]) {
		super(name, price, color);
	}

	private String gb[];

	public Kjh0313_child(String name, int price, String[] color, String[] gb) {
		super(name, price, color);
		this.gb = gb;
	}

	public void introduce(String gb[]) {
		System.out.println("역할군: " + super.name + "\n최종DPS(단일기준): " + super.price);
		System.out.print("포지션: ");
		for (int i = 0; i < super.color.length; i++) {
			System.out.print(color[i] + " ");
		}
		System.out.println();
		System.out.print("사거리: ");
		for (int i = 0; i < gb.length; i++) {
			System.out.print(gb[i] + " ");
		}
	}
}