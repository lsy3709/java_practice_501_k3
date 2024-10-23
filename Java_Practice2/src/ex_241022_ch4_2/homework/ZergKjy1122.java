package ex_241022_ch4_2.homework;

public class ZergKjy1122 {
    String name;  // 이름
    String type;  // 종류 (공격 유닛, 생산 유닛)
    int price;    // 가격

    // 생성자
    public ZergKjy1122(String name, String type, int price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }

    // 이동 기능
    public void move() {
        System.out.println(name + "이(가) 이동합니다.");
    }

    // 공격 기능
    public void attack() {
        System.out.println(name + "이(가) 공격합니다.");
    }

    // 업그레이드 기능
    public void upgrade() {
        System.out.println(name + "이(가) 업그레이드되었습니다.");
    }

    // 멤버 속성 모두 출력하는 기능
    public void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("종류: " + type);
        System.out.println("가격: " + price + " 미네랄");
    }
}
