package ex_241022_ch4_2.homework;

public class Kjh0313_main {

	public static void main(String[] args) {
		Kjh0313_child kjh0313_child1 = new Kjh0313_child("아이폰14", 95000,
				new String[] { "옐로우", "레드", "블랙", "바이올렛", "화이트" });
		Kjh0313_child kjh0313_child2 = new Kjh0313_child("아이폰15", 150000,
				new String[] { "옐로우", "레드", "블랙", "바이올렛", "화이트" });
System.out.println("부모 클래스에서 소개");
kjh0313_child1.introduce();
System.out.println();
System.out.println("자식 클래스에서 소개");
kjh0313_child2.introduce(new String[] {"64GB", "128GB", "258GB"});
	}
}