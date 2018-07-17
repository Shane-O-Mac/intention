package monsters;

public class StoneSlipper extends Monster {

	public StoneSlipper(String nam, int hp, int attkDmg, int def, int dodg, int diff) {
		super(nam, hp, attkDmg, def, dodg, diff);
	}
	static StoneSlipper stoneSlipper = new StoneSlipper("Stone Slipper", 12, 10, 2, 6, 2);
	public static StoneSlipper getStoneSlipper(){
		return stoneSlipper;
	}
	@Override
	public String toString() {
		return "StoneSlipper [name=" + name + ", health=" + health + ", attackDamage=" + attackDamage + ", defense="
				+ defense + ", dodge=" + dodge + ", difficulty=" + difficulty + "]";
	}
}//End class StoneSlipper
