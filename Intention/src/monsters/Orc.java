package monsters;

public class Orc extends Monster {

	public Orc(String nam, int hp, int attkDmg, int def, int dodg, int diff) {
		super(nam, hp, attkDmg, def, dodg, diff);
	}
	static Orc orc = new Orc("Orc", 18, 8, 6, 2, 3);
	
	public static Orc getOrc(){
		return orc;
	}

	@Override
	public String toString() {
		return "Orc [name=" + name + ", health=" + health + ", attackDamage=" + attackDamage + ", defense=" + defense
				+ ", dodge=" + dodge + ", difficulty=" + difficulty + "]";
	}
}//End class Orc
