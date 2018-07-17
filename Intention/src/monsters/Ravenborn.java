package monsters;

public class Ravenborn extends Monster {

	public Ravenborn(String nam, int hp, int attkDmg, int def, int dodg, int diff) {
		super(nam, hp, attkDmg, def, dodg, diff);
	}
	static Ravenborn ravenBorn = new Ravenborn("Ravenborn", 7, 8, 0, 5, 1);
	
	public static Ravenborn getRavenborn(){
		return ravenBorn;
	}

	@Override
	public String toString() {
		return "Ravenborn [name=" + name + ", health=" + health + ", attackDamage=" + attackDamage + ", defense="
				+ defense + ", dodge=" + dodge + ", difficulty=" + difficulty + "]";
	}
	
	
}//End Class Ravenborn
