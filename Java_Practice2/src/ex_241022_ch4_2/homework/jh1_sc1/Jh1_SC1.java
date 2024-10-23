package ex_241022_ch4_2.homework.jh1_sc1;

public class Jh1_SC1 {
  public enum Race {
    Terran,
    Zerg,
    Protoss
  };

  public enum Size {
    Small,
    Medium,
    Large
  };

  public enum DamageType {
    Concussive,
    Explosive,
    Normal
  };


  public static void main(String[] args) {
      Jh1_Unit[] units = {
        new Jh1_Marine(),
        new Jh1_Vulture(),
        new Jh1_SpiderMine(),
        new Jh1_SiegeTank(),
        new Jh1_SiegeTankMode(),
        new Jh1_Goliath(),
        new Jh1_Zergling(),
        new Jh1_Hydralisk(),
        new Jh1_Lurker(),
        new Jh1_Mutalisk(),
        new Jh1_Zealot(),
        new Jh1_Dragoon(),
        new Jh1_DarkTemplar()
      };

      for (Jh1_Unit unit : units) {
        unit.showBasicInfo();
        unit.showSpecialInfo();
        unit.showWeapons();
        System.out.println("\n");
      }
  }
}