package classes;

public class Warrior extends Class{

	public Warrior(String voc, String nam, int hp, int man, int attkDmg, int def, int lvl, int exp) {
		super(voc, nam, hp, man, attkDmg, def, lvl, exp);
	}
	static Warrior warrior = new Warrior("Warrior", "Steve", 50, 20, 45, 15, 1, 0);
	
	public static Warrior getWarrior(){
		return warrior;
	}
	
	public String toString(){
		return "Vocation: " + this.getVocation() + " | " + "Name: " + this.getName() + " | " + "Health: " + 
				this.getHealth() + " | " + "Mana: " + this.getMana() + " | " + "Attack Damage: " + 
				this.getAttackDamage() + " | " + "Defense: " + this.getDefense() + " | ";
	}

}
