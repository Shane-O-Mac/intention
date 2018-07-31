package classes;
import java.util.*;

public class Class {
	//Class Variables
	String vocation, name;
	int health, mana, attackDamage, defense, level, experience;
	
	
	//Class Objects
	Scanner scan = new Scanner(System.in);
	Random rand = new Random();
	
	public Class(String voc, String nam, int hp, int man, int attkDmg, int def, int lvl, int exp){
		vocation = voc;
		name = nam;
		health = hp;
		mana = man;
		attackDamage = attkDmg;
		defense = def;
		level = lvl;
		experience = exp;
	}

	//Getters And Setters
	public String getVocation() {
		return vocation;
	}

	public void setVocation(String vocation) {
		this.vocation = vocation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getAttackDamage() {
		return attackDamage;
	}

	public void setAttackDamage(int attackDamage) {
		this.attackDamage = attackDamage;
	}

	public int getDefense() {
		return defense;
	}

	public void setDefense(int defense) {
		this.defense = defense;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

}//End Class 'Class'
