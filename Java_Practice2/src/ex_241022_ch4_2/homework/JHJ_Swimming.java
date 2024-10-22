package ex_241022_ch4_2.homework;

public class JHJ_Swimming extends JHJ_Sports {

	
	public JHJ_Swimming() {
        super("수영", "물에서 하는 스포츠");
    }


    public void place() {
        System.out.println("장소: 수영장");
    }

     public void needs() {
        System.out.println("준비물: 수영복, 수영모, 수");
    }


    public void price() {
		System.out.println("수강료: 100,000원");
	}
}
