package ex_241022_ch4_2.homework;

public class JHJ_Running extends JHJ_Sports {

	public JHJ_Running() {
		super("러닝", "육상 스포츠");
	}

	public void place() {
		System.out.println("장소: 운동장");
	}

	public void needs() {
		System.out.println("준비물: 운동복, 운동화");
	}

	public void price() {
		System.out.println("수강료: 10,000원");
	}
}
