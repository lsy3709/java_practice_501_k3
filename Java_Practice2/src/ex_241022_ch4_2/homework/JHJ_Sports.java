package ex_241022_ch4_2.homework;

public class JHJ_Sports {

	protected String name;
	protected String need; // 1. 공격유닛 , 날아다님
	protected int price;

	public JHJ_Sports(String name, String need) {
		super();
		this.name = name;
		this.need = need;
//		this.price= price;
	}

	public void place() {
        System.out.println();
    }

    // 준비물
    public void needs() {
        System.out.println();
    }

    // 수강료
    public void price() {
        System.out.println();
    }

    // 소개gkrl
    public void introduce() {
        System.out.println("종목: " + name);
        System.out.println("유형: " + need);
        
    }

}
