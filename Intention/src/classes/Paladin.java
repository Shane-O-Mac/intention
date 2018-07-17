package classes;

public class Paladin extends Class {

	public Paladin(String voc, String nam, int hp, int man, int attkDmg, int def, int lvl, int exp) {
		super(voc, nam, hp, man, attkDmg, def, lvl, exp);
	}
	
	static Paladin paladin = new Paladin("Paladin", "Jimmy", 75, 30, 25, 45, 1, 0);
	
	public static Paladin getPaladin(){
		return paladin;
	}
	
	public String toString(){
		return "Vocation: " + this.getVocation() + " | " + "Name: " + this.getName() + " | " + "Health: " + 
				this.getHealth() + " | " + "Mana: " + this.getMana() + " | " + "Attack Damage: " + 
				this.getAttackDamage() + " | " + "Defense: " + this.getDefense() + " | ";
	}

}//End Class Paladin
