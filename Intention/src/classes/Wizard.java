package classes;

public class Wizard extends Class {

	public Wizard(String voc, String nam, int hp, int man, int attkDmg, int def, int lvl, int exp) {
		super(voc, nam, hp, man, attkDmg, def, lvl, exp);
	}
	
	static Wizard wizard = new Wizard("Wizard", "Ricky", 35, 80, 10, 10, 1, 0);
	
	public static Wizard getWizard(){
		return wizard;
	}
	
	public String toString(){
		return "Vocation: " + this.getVocation() + " | " + "Name: " + this.getName() + " | " + "Health: " + 
				this.getHealth() + " | " + "Mana: " + this.getMana() + " | " + "Attack Damage: " + 
				this.getAttackDamage() + " | " + "Defense: " + this.getDefense() + " | ";
	}

}//End Class Wizard
