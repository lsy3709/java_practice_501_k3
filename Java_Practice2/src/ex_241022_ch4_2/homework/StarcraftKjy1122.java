package ex_241022_ch4_2.homework;

import java.util.Random;

public class StarcraftKjy1122 {
    public static void main(String[] args) {
        ZergKjy1122[] zergUnits = {
            new MutaliskKjy1122(),
            new HydraliskKjy1122(),
            new ZerglingKjy1122()
        };

        System.out.println("==== 스타크래프트 유닛 소개 ====");
        for (ZergKjy1122 zerg : zergUnits) {
            zerg.printInfo();
            zerg.move();
            zerg.attack();
            System.out.println();
        }

       
        Random random = new Random();
        int randomIndex = random.nextInt(zergUnits.length);
        System.out.println("==== 랜덤 추천 유닛 ====");
        zergUnits[randomIndex].printInfo();
    }
}
