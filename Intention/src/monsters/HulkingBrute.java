package monsters;

public class HulkingBrute extends Monster {

	public HulkingBrute(String nam, int hp, int attkDmg, int def, int dodg, int diff) {
		super(nam, hp, attkDmg, def, dodg, diff);
	}
	static HulkingBrute hulkingBrute = new HulkingBrute("Hulking Brute", 14, 11, 2, 1, 2);
	public static HulkingBrute getHulkingBrute(){
		return hulkingBrute;
	}
	@Override
	public String toString() {
		return "HulkingBrute [name=" + name + ", health=" + health + ", attackDamage=" + attackDamage + ", defense="
				+ defense + ", dodge=" + dodge + ", difficulty=" + difficulty + "]";
	}
	
}//End Class HulkingBrute
