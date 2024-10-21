package ex_241021_ch4.homework;


import java.util.Random; // Random 클래스 임포트

public class Kjy1122_Main {
    public static void main(String[] args) {
        String[] food1Materials = {"돼지고기", "밥", "국수"};
        String[] food2Materials = {"닭고기", "양파", "당근"};
        String[] food3Materials = {"밀가루", "계란", "파"};

        // Kjy1122_Food 클래스를 사용해야 합니다.
        Kjy1122_Food food1 = new Kjy1122_Food("돼지국밥", 9000, food1Materials);
        Kjy1122_Food food2 = new Kjy1122_Food("닭볶음탕", 12000, food2Materials);
        Kjy1122_Food food3 = new Kjy1122_Food("칼국수", 8000, food3Materials);

        Kjy1122_Food[] foods = {food1, food2, food3};

        System.out.println("==== 음식 소개 ====");
        for (Kjy1122_Food food : foods) {
            food.introduce();
            System.out.println();
        }

        // 랜덤으로 하나의 음식을 추천
        Random random = new Random();
        int randomIndex = random.nextInt(foods.length);
        System.out.println("==== 추천 음식 ====");
        foods[randomIndex].introduce();
    }
}

