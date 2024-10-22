package ex_241022_ch4_2.homework;

public class JHJ_Badminton extends JHJ_Sports {

	public JHJ_Badminton() {
		super("배드민턴", "라켓 스포츠");
	}

	public void place() {
		System.out.println("장소: 체육관");
	}

	public void needs() {
		System.out.println("준비물: 라켓, 셔틀콕, 운동화");
	}

	public void price() {
		System.out.println("수강료: 50,000원");
	}
}
