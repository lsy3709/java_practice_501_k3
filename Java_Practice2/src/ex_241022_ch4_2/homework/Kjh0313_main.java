package ex_241022_ch4_2.homework;


public class Kjh0313_main {
	
	
	public static void main(String[] args) {
		Kjh0313_child kjh0313_child1 = new Kjh0313_child("암살자", 4000,
				new String[] { "적군 후방" });
		Kjh0313_child kjh0313_child2 = new Kjh0313_child("브루저", 3000,
				new String[] { "아군 전방" });
System.out.println("");
kjh0313_child1.introduce(new String[] {"150~200"});
System.out.println();
System.out.println("");
kjh0313_child2.introduce(new String[] {"150~400"});
	}
}