package ex_241022_ch4_2.homework.jh1_sc1;

public abstract class Jh1_ZergUnit extends Jh1_Unit {
  public Jh1_ZergUnit(String name) {
    super(name);
    this.race = Jh1_SC1.Race.Zerg;
    this.isBionic = true;
    this.isMachine = false;
  }
}