package monsters;

public class Skeleton extends Monster {

	public Skeleton(String nam, int hp, int attkDmg, int def, int dodg, int diff) {
		super(nam, hp, attkDmg, def, dodg, diff);
	}
	static Skeleton skeleton = new Skeleton("Skeleton", 12, 8, 2, 4, 2);
	public static Skeleton getSkeleton(){
		return skeleton;
	}
	@Override
	public String toString() {
		return "Skeleton [name=" + name + ", health=" + health + ", attackDamage=" + attackDamage + ", defense="
				+ defense + ", dodge=" + dodge + ", difficulty=" + difficulty + "]";
	}	
}//End class Skeleton
