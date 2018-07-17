package monsters;

public class WaterGrazer extends Monster {

	public WaterGrazer(String nam, int hp, int attkDmg, int def, int dodg, int diff) {
		super(nam, hp, attkDmg, def, dodg, diff);
	}
	static WaterGrazer waterGrazer = new WaterGrazer("Water Grazer", 10, 9, 1, 3, 2);
	public static WaterGrazer getWaterGrazer(){
		return waterGrazer;
	}
	@Override
	public String toString() {
		return "WaterGrazer [name=" + name + ", health=" + health + ", attackDamage=" + attackDamage + ", defense="
				+ defense + ", dodge=" + dodge + ", difficulty=" + difficulty + "]";
	}
	
}//End class WaterGrazer
