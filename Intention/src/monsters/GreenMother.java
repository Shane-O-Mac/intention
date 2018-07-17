package monsters;

public class GreenMother extends Monster {

	public GreenMother(String nam, int hp, int attkDmg, int def, int dodg, int diff) {
		super(nam, hp, attkDmg, def, dodg, diff);
	}
	static GreenMother greenMother = new GreenMother("Green Mother", 24, 15, 3, 0, 3);
	public static GreenMother getGreenMother(){
		return greenMother;
	}
	@Override
	public String toString() {
		return "GreenMother [name=" + name + ", health=" + health + ", attackDamage=" + attackDamage + ", defense="
				+ defense + ", dodge=" + dodge + ", difficulty=" + difficulty + "]";
	}
	
}//End Class GreenMother
