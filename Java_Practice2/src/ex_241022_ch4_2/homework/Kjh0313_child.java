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
		System.out.println("핸드폰 기종: " + super.name + "\n가격: " + super.price);
		System.out.print("색상: ");
		for (int i = 0; i < super.color.length; i++) {
			System.out.print(color[i] + " ");
		}
		System.out.println();
		System.out.print("용량: ");
		for (int i = 0; i < gb.length; i++) {
			System.out.print(gb[i] + " ");
		}
	}
}