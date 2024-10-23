package ex_241022_ch4_2.homework;

public class MutaliskKjy1122 extends ZergKjy1122 {
    public MutaliskKjy1122() {
        super("뮤탈리스크", "공격 유닛", 100);
    }

    @Override
    public void move() {
        System.out.println(name + "이(가) 날아다닙니다.");
    }

    @Override
    public void attack() {
        System.out.println(name + "이(가) 3단 공격을 합니다.");
    }
}
