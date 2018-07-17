package monsters;

public class RatDragon extends Monster {

	public RatDragon(String nam, int hp, int attkDmg, int def, int dodg, int diff) {
		super(nam, hp, attkDmg, def, dodg, diff);
	}
	static RatDragon ratDragon = new RatDragon("Rat Dragon", 20, 13, 3, 2, 3);
	public static RatDragon getRatDragon(){
		return ratDragon;
	}
	@Override
	public String toString() {
		return "RatDragon [name=" + name + ", health=" + health + ", attackDamage=" + attackDamage + ", defense="
				+ defense + ", dodge=" + dodge + ", difficulty=" + difficulty + "]";
	}
	
}//End class RatDragon
