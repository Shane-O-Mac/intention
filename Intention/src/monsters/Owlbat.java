package monsters;

public class Owlbat extends Monster {

	public Owlbat(String nam, int hp, int attkDmg, int def, int dodg, int diff) {
		super(nam, hp, attkDmg, def, dodg, diff);
	}
	static Owlbat owlBat = new Owlbat("Owlbat", 6, 6, 0, 7, 1);
	
	public static Owlbat getOwlBat(){
		return owlBat;
	}

	@Override
	public String toString() {
		return "Owlbat [name=" + name + ", health=" + health + ", attackDamage=" + attackDamage + ", defense=" + defense
				+ ", dodge=" + dodge + ", difficulty=" + difficulty + "]";
	}
	
}//End Class Owlbat
