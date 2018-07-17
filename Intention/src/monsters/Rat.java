package monsters;

public class Rat extends Monster {

	public Rat(String nam, int hp, int attkDmg, int def, int dodg, int diff) {
		super(nam, hp, attkDmg, def, dodg, diff);
	}
	static Rat rat = new Rat("Rat", 5, 6, 0, 30, 1);
	
	public static Rat getRat(){
		
		return rat;
	}

	@Override
	public String toString() {
		return "Rat [name=" + name + ", health=" + health + ", attackDamage=" + attackDamage + ", defense=" + defense
				+ ", dodge=" + dodge + ", difficulty=" + difficulty + "]";
	}
	
}//End class Rat
