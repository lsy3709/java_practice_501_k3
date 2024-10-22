package ex_241021_ch4.homework;

import java.util.Random;

class Food {
	String name;
	int price;
	String material[];

	Food(String name, int price, String[] material) {
		this.name = name;
		this.price = price;
		this.material = material;
	}

	void introduceFoods() {
		System.out.println("음식이름: " + name + "\n가격: " + price);
		System.out.print("재료:");
		for (int i = 0; i < material.length; i++) {
			System.out.print(material[i] + " ");
		}
		System.out.println();
	}

	static void randomFoods(Food[] foods) {
		Random random = new Random();
		int randomIndex = random.nextInt(foods.length);
		System.out.println("랜덤하게 선택된 음식:");
		foods[randomIndex].introduceFoods();
	}
}

public class Lsh1208_homework2_Food {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food lshFood1 = new Food("햄버거", 5900, new String[] { "치즈", "빵" });
		Food lshFood2 = new Food("피자", 12000, new String[] { "치즈", "도우", "토마토 소스" });
		Food lshFood3 = new Food("스파게티", 8500, new String[] { "면", "소스", "고기" });
		lshFood1.introduceFoods();

		Food.randomFoods(new Food[] { lshFood1, lshFood2, lshFood3 });
	}
}
