package ex_241022_ch4_2.homework;

public class Lsh1208_homework_main {

	public static void main(String[] args) {
		Lsh1208_homework_child lsh1208_homework_child1 = new Lsh1208_homework_child("아이폰14", 950000,
				new String[] { "엘로우", "레드", "블랙", "바이올렛", "화이트" });
		Lsh1208_homework_child lsh1208_homework_child2 = new Lsh1208_homework_child("아이폰15", 1290000,
				new String[] { "엘로우", "레드", "블랙", "바이올렛", "화이트" });
		System.out.println("==========부모 클래스에서 소개==========");
		lsh1208_homework_child1.introduce();
		System.out.println();
		System.out.println("=======자식 클래스에서 소개(용량 추가)=======");
		lsh1208_homework_child2.introduce(new String[] { "64GB", "128GB", "258GB" });

	}
}