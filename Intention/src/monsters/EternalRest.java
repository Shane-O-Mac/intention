package monsters;

public class EternalRest extends Monster {

	public EternalRest(String nam, int hp, int attkDmg, int def, int dodg, int diff) {
		super(nam, hp, attkDmg, def, dodg, diff);
	}
	static EternalRest eternalRest = new EternalRest("Eternal Rest", 20, 6, 0, 8, 3);
	public static EternalRest getEternalRest(){
		return eternalRest;
	}
	@Override
	public String toString() {
		return "EternalRest [name=" + name + ", health=" + health + ", attackDamage=" + attackDamage + ", defense="
				+ defense + ", dodge=" + dodge + ", difficulty=" + difficulty + "]";
	}
	
}//End class EternalRest
