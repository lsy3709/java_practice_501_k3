package ex_241022_ch4_2.homework;

	import java.util.Random;

	abstract class Terran {
	    String name;
	    String type; 
	    int cost;

	    Terran(String name, String type, int cost) {
	        this.name = name;
	        this.type = type;
	        this.cost = cost;
	    }

	    
	    public abstract void move();

	   
	    public abstract void attack();

	    
	    
	    public String introduce() {
	        return "이름: " + name + ", 종류: " + type + ", 공격력: " + cost;
	    }

	    
	    public abstract void action();
	}

	class Marrin extends Terran {
	    Marrin() {
	        super("마린", "공격", 6);
	    }

	    @Override
	    public void move() {
	        System.out.println(name + "는 기갑보병입니다.");
	    }

	    @Override
	    public void attack() {
	        System.out.println(name + "이 기관총을 쏩니다(두두두두)");
	    }

	    @Override
	    public void action() {
	        System.out.println(name + "이 공격하고 있습니다!");
	    }
	}

	class Battlecruiser extends Terran {
		Battlecruiser() {
	        super("배틀크루저", "공격", 25);
	    }

	    @Override
	    public void move() {
	        System.out.println(name + " 전투순양함이 하늘을 납니다.");
	    }

	    @Override
	    public void attack() {
	        System.out.println(name + "가 상대진지를 공격합니다.");
	    }

	    @Override
	    public void action() {
	        System.out.println(name + "가 적을 향해 공격합니다!");
	    }
	}

	class Vulture extends Terran {
		Vulture() {
	        super("벌쳐", "마인세개(자매품, 벌쳐)", 20);
	    }

	    @Override
	    public void move() {
	        System.out.println(name + "가 빠르게 달립니다.");
	    }

	    @Override
	    public void attack() {
	        System.out.println(name + "가 기본 공격을 수행합니다.");
	    }

	    @Override
	    public void action() {
	        System.out.println(name + "가 공격중입니다!");
	    }
	}

	public class Kdh1018homework {
	    public static void main(String[] args) {
	        Terran[] TerranUnits = {new Marrin(), new Battlecruiser(), new Vulture()};
	        Random rand = new Random();

	      
	        for (int i = 0; i < 3; i++) {
	            int randomIndex = rand.nextInt(TerranUnits.length);
	            Terran unit = TerranUnits[randomIndex];
	            System.out.println(unit.introduce());
	            unit.move();
	            unit.attack();
	            unit.action();
	            System.out.println();
	        }
	    }
	}


