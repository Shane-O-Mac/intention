package monsters;

public class Bonepicker extends Monster {

	public Bonepicker(String nam, int hp, int attkDmg, int def, int dodg, int diff) {
		super(nam, hp, attkDmg, def, dodg, diff);
	}
	static Bonepicker bonePicker = new Bonepicker("Bonepicker", 3, 6, 0, 8, 1);
	public static Bonepicker getBonepicker(){
		return bonePicker;
	}
	@Override
	public String toString() {
		return "Bonepicker [name=" + name + ", health=" + health + ", attackDamage=" + attackDamage + ", defense="
				+ defense + ", dodge=" + dodge + ", difficulty=" + difficulty + "]";
	}
	
}//End Class Bonepicker
